package com.test.stepdefinition;

import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class PhotoDemoStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((PhotoDemoStepDefinition.class)));

    @Given("que ingresamos a la aplicacion TheApp")
    public void queIngresamosALaAplicacionTheApp() {

    }
    @When("seleccionamos la opcion la opcion PhotoDemo y seleccionamos una foto")
    public void seleccionamosLaOpcionLaOpcionPhotoDemoYSeleccionamosUnaFoto() {

    }
    @Then("obtenemos la información de la foto")
    public void obtenemosLaInformaciónDeLaFoto() {

    }
}
