package com.sofkau.stepdefinitions;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.junit.Before;
import sofkau.question.TheResultEchoBox;
import sofkau.question.TheResultlogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static sofkau.task.EchoBoxTask.echoBox;
import static sofkau.task.InicioSesionTask.inicioSesion;

public class EchoBoxSD extends SetUp {


    public static Logger LOGGER = Logger.getLogger(InicioSesionSD.class);


    @Before
    public void before() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario esta en la pagina de inicio de la app")
    public void elUsuarioEstaEnLaPaginaDeInicioDeLaApp() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            LOGGER.info("INICIA LA AUTOMATIZACION");
        } catch (Exception e) {
            LOGGER.info(" fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
        }
    }

    @When("navega hasta la opcion de echo box envia la {string} al  chat")
    public void navegaHastaLaOpcionDeEchoBoxEnviaLosDatosAlChat(String informacion) {
        try {
            actor.attemptsTo(
                    echoBox()
                            .conElMensaje(informacion)
            );
            LOGGER.info("Realiza la peticion");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());
        }
    }

    @Then("el usuario debe ver su {string} guardado en pantalla")
    public void elUsuarioDebeVerSuGuardadoEnPantalla(String mensaje) {
        try {
            actor.should(
                    seeThat(TheResultEchoBox.isEqualTo(), containsString((mensaje)))
            );

            LOGGER.info("CUMPLE");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());

        }
    }
}
