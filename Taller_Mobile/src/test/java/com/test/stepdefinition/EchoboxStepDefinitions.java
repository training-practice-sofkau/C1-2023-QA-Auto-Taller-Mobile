package com.test.stepdefinition;

import com.test.question.ValidarLoginExitoso;
import com.test.question.ValidarLoginFallido;
import com.test.question.ValidarMensajeEchobox;
import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.Before;

import static com.test.task.EchoboxTask.echoboxTask;
import static com.test.task.LoginTask.loginTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class EchoboxStepDefinitions extends SetUp {
    public static Logger LOGGER = Logger.getLogger(EchoboxStepDefinitions.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que el usuario esta en la pagina del inicio")
    public void queElUsuarioEstaEnLaPaginaDelInicio() {
        try {
            LOGGER.info("INICIA LA AUTOMATIZACION");
            actor.can(BrowseTheWeb.with(theMobileDevice));

        }catch (Exception exception){
            LOGGER.info(" fallo la configuracion inicial");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }
    @When("el usuario entra a la funcion echobox y escribe el mensaje {string}")
    public void elUsuarioEntraALaFuncionEchoboxYEscribeElMensaje(String mensaje) {
        try {
            actor.attemptsTo(
                    echoboxTask()
                            .conElMensaje(mensaje)
            );
        }catch (Exception exception){
            LOGGER.info(" fallo en en la pagina echobox");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }
    @Then("el usuario debera ver en pantalla el mensaje {string}")
    public void elUsuarioDeberaVerEnPantallaElMensaje(String mensaje) {
      try {

            actor.should(
                    seeThat(ValidarMensajeEchobox.isEqualTo(), containsString(String.format(mensaje)))
            );
            LOGGER.info("CUMPLE");
        }catch (Exception exception){
            LOGGER.info("Error al realizar la comparacion");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }

}
