package com.sofkau.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.junit.Before;
import com.sofkau.setup.SetUp;
import sofkau.question.TheResultlogin;
import sofkau.task.InicioSesionTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static sofkau.task.InicioSesionTask.inicioSesion;


public class InicioSesionSD extends SetUp {


    public static Logger LOGGER = Logger.getLogger(InicioSesionSD.class);


    @Before
    public void before() {

        OnStage.setTheStage(new OnlineCast());
    }


    @Given("el usuario esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));

            LOGGER.info("INICIA LA AUTOMATIZACION");
        } catch (Exception e) {
            LOGGER.info(" fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
        }
    }

    @When("el usuario envia los campos de iniciar sesion {string}, {string}")
    public void elUsuarioEnviaLosCamposDeIniciarSesion(String user, String password) {
        try {
            actor.attemptsTo(
                    inicioSesion()
                            .conElUsuario(user)
                            .yconElPassword(password)
            );
            LOGGER.info("Realiza la peticion");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());
        }
    }

    @Then("el usuario debe ver un {string}")
    public void elUsuarioDebeVerUn(String mensaje) {

        try {
            actor.should(
                    seeThat(TheResultlogin.isEqualTo(), containsString((mensaje)))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());

        }

    }

}
