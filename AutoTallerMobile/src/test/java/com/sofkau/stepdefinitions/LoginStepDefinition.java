package com.sofkau.stepdefinitions;

import com.sofkau.questions.LoginResult;
import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.Before;

import static com.sofkau.tasks.NavigateToLoginScreen.navigateToLoginScreen;
import static com.sofkau.tasks.LoginTask.loginTask;
import static com.sofkau.util.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.sofkau.questions.LoginResult.loginResult;
import static org.hamcrest.Matchers.equalTo;


public class LoginStepDefinition extends SetUp {

    public static Logger LOGGER = Logger.getLogger(LoginStepDefinition.class);
    @Before
    public void before(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario ingresa a la aplicacion")
    public void elUsuarioIngresaALaAplicacion() {
        try {
            setUplog4j();
            actor.can(BrowseTheWeb.with(theMobileDevice));
            LOGGER.info("INICIO AUTOMATIZACION");
        } catch (Exception e){
            LOGGER.info("Fallo en la configuracion inicial");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();
        }
    }
    @When("el usuario diligencia el formulario de inicio de sesion")
    public void elUsuarioDiligenciaElFormularioDeInicioDeSesion() {
        try {
            actor.attemptsTo(
                    navigateToLoginScreen(),
                    loginTask()
                            .conElUsuario(SET_USER)
                            .yConElPassword(SET_PASSWORD)
            );
        } catch (Exception e){
            LOGGER.info("Fallo diligenciando el formulario");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();
        }
    }
    @Then("es dirigido a la seccion Secret Area y visualiza un mensaje con su nombre de usuario")
    public void esDirigidoALaSeccionSecretAreaYVisualizaUnMensajeConSuNombreDeUsuario() {
        try {
            actor.should(
                seeThat(loginResult(), equalTo(LOGIN_MESSAGE))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e){
            LOGGER.info("Fallo en la comparacion de resultados");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();
        }
    }

}
