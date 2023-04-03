package com.test.stepdefinition;

import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.Before;

public class LoginFallidoStepDefinition extends SetUp {

    public static Logger LOGGER= Logger.getLogger(LoginFallidoStepDefinition.class);
    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Se ingresa a la aplicacion")
    public void seIngresaALaAplicacion() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e){
            LOGGER.warn("Fallo en la automatizacion");
            Assertions.fail(e.getMessage());
        }
    }
    @When("Se llenan los campos con {string} y {string} con credenciales invalidas")
    public void seLlenanLosCamposConYConCredencialesInvalidas(String string, String string2) {

    }
    @Then("Obtenemos un mensaje de logueo fallido {string}")
    public void obtenemosUnMensajeDeLogueoFallido(String string) {

    }
}
