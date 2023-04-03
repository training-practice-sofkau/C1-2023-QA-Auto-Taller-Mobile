package com.test.stepdefinition;

import static org.hamcrest.Matchers.containsString;
import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;

import static com.sofkau.question.TheResult.theResult;
import static com.sofkau.task.GrabarTexto.grabarTexto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class EchoBoxStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((EchoBoxStepDefinition.class)));


    @Given("que abrimos a la aplicacion TheApp")
    public void queAbrimosALaAplicacionTheApp() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
        } catch (Exception e) {
            LOGGER.error("Error a la app para la opcion EchoBox: " + e.getMessage());
        }

    }
    @When("seleccionamos la opcion la opcion EchoBox y escribimos un mensaje")
    public void seleccionamosLaOpcionLaOpcionEchoBoxYEscribimosUnMensaje() {
        try {
            actor.attemptsTo(
                    grabarTexto()
            );
        } catch (Exception e) {
            LOGGER.error("Error al ingresar el mensaje: " + e.getMessage());
        }
    }

    @Then("observamos el mensaje en pantalla")
    public void observamosElMensajeEnPantalla() {
        try {
            actor.should(
                    seeThat(theResult(),containsString("Here's what you said before:"))
            );
        } catch (Exception e) {
            LOGGER.error("Error al verificar la aserción: " + e.getMessage());
        }
    }
}
