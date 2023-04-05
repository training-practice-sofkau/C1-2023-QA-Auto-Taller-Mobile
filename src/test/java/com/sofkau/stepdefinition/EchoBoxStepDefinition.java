package com.sofkau.stepdefinition;

import static org.hamcrest.Matchers.containsString;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.question.TheResultEcho.theResultEcho;
import static com.sofkau.task.GrabarTexto.grabarTexto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class EchoBoxStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((EchoBoxStepDefinition.class)));

    @Given("que abrimos a la aplicacion TheApp")
    public void queAbrimosALaAplicacionTheApp() {
        try {
            configurarMobile();
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e) {
            LOGGER.error("Error a la app para la opcion EchoBox: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }
    @When("seleccionamos la opcion EchoBox y escribimos un mensaje")
    public void seleccionamosLaOpcionEchoBoxYEscribimosUnMensaje() {
        try {
            actor.attemptsTo(
                    grabarTexto()
            );
        } catch (Exception e) {
            LOGGER.error("Error al ingresar el mensaje: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @Then("observamos el mensaje en pantalla")
    public void observamosElMensajeEnPantalla() {
        try {
            LOGGER.info("Verificando que el usuario vea el mensaje en la pantalla");
            actor.should(
                    seeThat(theResultEcho(),containsString("Here's what you said before:"))
            );
            LOGGER.info("Mensaje en pantalla visto correctamente");
        } catch (Exception e) {
            LOGGER.error("Error al verificar la aserción: " + e.getMessage());
            Assertions.fail();
        }
        finally {
            quitarDriver();
        }
    }
}
