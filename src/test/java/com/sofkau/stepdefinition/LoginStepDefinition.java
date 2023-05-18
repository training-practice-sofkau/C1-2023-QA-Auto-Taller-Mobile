package com.sofkau.stepdefinition;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.question.TheResultLogin.theResultLogin;
import static com.sofkau.task.IniciarSesion.iniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((LoginStepDefinition.class)));
    @Given("que accedemos a la aplicacion TheApp")
    public void queAccedemosALaAplicacionTheApp() {
        try {
            configurarMobile();
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e) {
            LOGGER.error("Error al ingresar a la app para la opcion login: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("seleccionamos la opcion LoginScreen e ingreso los dados")
    public void seleccionamosLaOpcionLoginScreenEIngresoLosDados() {
        try {
            actor.attemptsTo(
                    iniciarSesion()
            );
            LOGGER.info("usuario y contraseña ingresados");
        } catch (Exception e) {
            LOGGER.error("Error al iniciar sesion: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }
    @Then("obtemos un mensaje de inicio de sesion exitoso")
    public void obtemosUnMensajeDeInicioDeSesionExitoso() {
        try {
            LOGGER.info("Verificando que el usuario vea un mensaje de login exitoso");
            actor.should(
                    seeThat(theResultLogin(),containsString("You are logged in as alice"))
            );
            LOGGER.info("mensaje de logueo visto correctamente");
        } catch (Exception e) {
            LOGGER.error("Error al verificar la aserción: " + e.getMessage());
            Assertions.fail();
        }
        finally {
            quitarDriver();
        }
    }
}
