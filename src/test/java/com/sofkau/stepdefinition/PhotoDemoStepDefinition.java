package com.sofkau.stepdefinition;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.question.TheResultPhoto.theResultPhoto;
import static com.sofkau.task.DescripcionFoto.descripcionFoto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class PhotoDemoStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((PhotoDemoStepDefinition.class)));

    @Given("que ingresamos a la aplicacion TheApp")
    public void queIngresamosALaAplicacionTheApp() {
        try {
            configurarMobile();
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e) {
            LOGGER.error("Error al ingresar a la app para la opcion PhotoDemo: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }
    @When("seleccionamos la opcion PhotoDemo y seleccionamos una foto")
    public void seleccionamosLaOpcionLaOpcionPhotoDemoYSeleccionamosUnaFoto() {
        try {
            actor.attemptsTo(
                    descripcionFoto()
            );
            LOGGER.info("Foto seleccionada");
        } catch (Exception e) {
            LOGGER.error("Error al iniciar sesion: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }
    @Then("obtenemos la información de la foto")
    public void obtenemosLaInformaciónDeLaFoto() {
        try {
            LOGGER.info("Verificando que el usuario vea un mensaje de la foto seleccionada");
            actor.should(
                    seeThat(theResultPhoto(),containsString("Selected Photo"))
            );
            LOGGER.info("mensaje de la foto seleccionada visto correctamente");
        } catch (Exception e) {
            LOGGER.error("Error al verificar la aserción: " + e.getMessage());
            Assertions.fail();
        }
        finally {
            quitarDriver();
        }
    }
}
