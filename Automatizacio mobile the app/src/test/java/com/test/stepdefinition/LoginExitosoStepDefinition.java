package com.test.stepdefinition;

import com.test.question.MensajeLoginExitoso;
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

import static com.test.task.IniciarSesion.iniciarSesion;
import static com.test.task.NavigateToLogin.navigateToLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginExitosoStepDefinition extends SetUp {

    public static Logger LOGGER= Logger.getLogger(LoginExitosoStepDefinition.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Se ingresa a la aplicacion The APP")
    public void seIngresaALaAplicacionTheAPP() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e){
            LOGGER.warn("Fallo en la automatizacion");
            Assertions.fail(e.getMessage());
        }
    }
    @When("Se llenan los campos con {string} y {string}")
    public void seLlenanLosCamposConY(String user, String password) {
        try {
            actor.attemptsTo(
                    navigateToLogin(),
                    iniciarSesion()
                            .conElUsuario(user)
                            .yLaContrasenna(password)
            );
            LOGGER.info("Iniciando sesion");
        } catch (Exception e){
            LOGGER.warn("Fallo al iniciar sesion");
            Assertions.fail(e.getMessage());
        }
    }
    @Then("Obtenemos un mensaje de logueo exitoso {string}")
    public void obtenemosUnMensajeDeLogueoExitoso(String mensaje) {
        try {
            actor.should(
                    seeThat("Mensaje de inicio de sesion",
                            MensajeLoginExitoso.isEqualTo(),
                            equalTo(mensaje))
            );
            LOGGER.info("Sesion iniciada correctamente");
        } catch (Exception e){
            LOGGER.warn("Resultado incorrecto");
            Assertions.fail(e.getMessage());
        }
    }
}
