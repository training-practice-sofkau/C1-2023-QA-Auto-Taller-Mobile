package com.sofkau.stepdefinitions;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import java.util.logging.Logger;

public class EchoBoxStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf(EchoBoxStepDefinition.class));
    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que el usuario ingresa a la app v1100")
    public void queElUsuarioIngresaALaAppV1100() {
        try {
            LOGGER.info("Inicia la automatizacion");
            actor.can(BrowseTheWeb.with(theMobileDevice));
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }

    @When("entra a la funcionalidad echo box")
    public void entraALaFuncionalidadEchoBox() {

    }
    @When("escribe y guarda un {string}")
    public void escribeYGuardaUn(String string) {

    }
    @Then("obtenemos un mensaje de {string}")
    public void obtenemosUnMensajeDe(String string) {

    }
}
