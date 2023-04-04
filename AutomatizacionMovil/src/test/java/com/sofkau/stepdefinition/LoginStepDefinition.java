package com.sofkau.stepdefinition;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.question.ElMensaje.elMensaje;
import static com.sofkau.question.ElTitulo.elTitulo;
import static com.sofkau.question.Logged.logged;
import static com.sofkau.question.SecretArea.secretArea;
import static com.sofkau.task.ColocarContrasenna.colocarContrasenna;
import static com.sofkau.task.ColocarUsuario.colocarUsuario;
import static com.sofkau.task.FinalizarLogin.finalizarLogin;
import static com.sofkau.task.IngresarLogin.ingresarLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.notNullValue;

public class LoginStepDefinition extends SetUp {
    private static Logger LOGGER= Logger.getLogger(LoginStepDefinition.class);
    @Given("El usuario esta en Login Screen")
    public void elUsuarioEstaEnLoginScreen() {
        try {
            ACTOR.attemptsTo(
                    ingresarLogin()
            );
            LOGGER.info("Se ingresa al Login");
        }catch (Exception e){
            LOGGER.info("Fallo el entrar en la opcion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("Ingresa el usuario y contrasenna")
    public void ingresaElUsuarioYContrasenna() {
        try {
            ACTOR.attemptsTo(
                    colocarUsuario().conElUsuario(""),
                    colocarContrasenna().conLaContrasenna(""),
                    finalizarLogin()
            );
            LOGGER.info("Se inicia sesion");
        }catch (Exception e){
            LOGGER.info("Fallo el entrar en la opcion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Then("Se redirige a la secret area")
    public void seRedirigeALaSecretArea() {
        try {
            ACTOR.should(
                    seeThat(secretArea(),containsString("Secret Area")),
                    seeThat(logged(),containsString("You are logged in as alice"))
            );
            LOGGER.info("Hace la comparacion");
        } catch (Exception e) {
            LOGGER.info("Fallo la comparacion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        } finally {
            quitarDriver();
        }
    }
}
