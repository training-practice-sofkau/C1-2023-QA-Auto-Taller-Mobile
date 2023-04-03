package com.test.stepdefinition;


import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import java.util.logging.Logger;


import static com.test.task.ClipboardTask.clipboardTask;
import static com.test.task.EscribirMensajeTask.escribirMensajeTask;
import static com.test.task.LoginEscreenTask.loginEscreenTask;
import static com.test.task.SetEscribirMensajeTask.setEscribirMensajeTask;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class SetMensajeSD extends SetUp {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(SetMensajeSD.class));

    @Given("Ingresamos a la funcionalidad Clipboard")
    public void ingresamosALaFuncionalidadClipboard() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            actor.attemptsTo(
                    clipboardTask()
            );

        } catch (Exception e) {
            LOGGER.info(" Fallo al abrir app");
            LOGGER.warning(e.getMessage());
            Assertions.fail(e.getMessage());
        }
    }
    @When("ingresa el mensaje {string}")
    public void ingresaElMensaje(String texto) {
        try {
            theActorInTheSpotlight().attemptsTo(
                    setEscribirMensajeTask()
                            .conElMsj(texto)
            );

        } catch (Exception e) {
            Assertions.fail("Fallo prueba");
        }


    }
    @Then("Obtendra el  mensaje {string}")
    public void obtendraElMensaje(String string) {

    }


}
