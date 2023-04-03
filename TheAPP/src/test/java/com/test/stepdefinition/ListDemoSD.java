package com.test.stepdefinition;


import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import java.util.logging.Logger;

import static com.test.task.ClipboardTask.clipboardTask;
import static com.test.task.SetEscribirMensajeTask.setEscribirMensajeTask;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ListDemoSD extends SetUp {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ListDemoSD.class));

    @Given("que el usario ingresa a la funcionalidad list demo")
    public void queElUsarioIngresaALaFuncionalidadListDemo() {

    }
    @When("seleciona una aplicacion")
    public void selecionaUnaAplicacion() {

    }
    @Then("Obtendra el nombre de la aplicacion")
    public void obtendraElNombreDeLaAplicacion() {
       
    }


}
