package com.test.stepdefinition;

import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class ListDemoStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((ListDemoStepDefinition.class)));

    @Given("que iniciamos la aplicacion TheApp")
    public void queIniciamosLaAplicacionTheApp() {

    }
    @When("seleccionamos la opcion la opcion ListDemo y seleccionamos una cosa")
    public void seleccionamosLaOpcionLaOpcionListDemoYSeleccionamosUnaCosa() {

    }
    @Then("obtenemos informacion acerca de la cosa de la lista")
    public void obtenemosInformacionAcercaDeLaCosaDeLaLista() {
    }
}
