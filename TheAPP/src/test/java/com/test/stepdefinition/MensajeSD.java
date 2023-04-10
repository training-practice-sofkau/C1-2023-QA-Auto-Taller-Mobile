package com.test.stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.test.setup.SetUp;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import java.util.logging.Logger;

import static com.test.task.ClipboardTask.clipboardTask;
import static com.test.task.EscribirMensajeTask.escribirMensajeTask;
import static com.test.task.MensajeTask.mensajeTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class MensajeSD extends SetUp {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(MensajeSD.class));

    @Given("Ingresamos a la funcionalidad Echo Box")
    public void ingresamosALaFuncionalidadEchoBox() {
        actor.can(BrowseTheWeb.with(theMobileDevice));
        actor.attemptsTo(
                clipboardTask()
        );
    }
    @When("Agregamos el mensaje {string}")
    public void agregamosElMensaje(String mensaje) {
        try {
            theActorInTheSpotlight().attemptsTo(
                    escribirMensajeTask()
                            .conElMsj(mensaje)
            );

        } catch (Exception e) {
            Assertions.fail("Fallo prueba");
        }
    }
    @Then("Obtenemos mensaje {string}")
    public void obtenemosMensaje(String string) {


    }


}
