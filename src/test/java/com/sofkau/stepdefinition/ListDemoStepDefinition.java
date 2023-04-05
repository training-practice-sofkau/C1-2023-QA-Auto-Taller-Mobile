package com.sofkau.stepdefinition;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.question.TheResultId.theResultId;
import static com.sofkau.task.ListaDeCosas.listaDeCosas;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class ListDemoStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((ListDemoStepDefinition.class)));

    @Given("que iniciamos la aplicacion TheApp")
    public void queIniciamosLaAplicacionTheApp() {
        try {
            configurarMobile();
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e) {
            LOGGER.error("Error a la app para la opcion ListDemo: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }
    @When("seleccionamos la opcion ListDemo y seleccionamos una cosa")
    public void seleccionamosLaOpcionListDemoYSeleccionamosUnaCosa() {
        try {
            actor.attemptsTo(
                    listaDeCosas()
            );
            LOGGER.info("Opcion seleccionada");
        } catch (Exception e) {
            LOGGER.error("Error al escoger una opcion: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }
    @Then("obtenemos informacion acerca de la cosa de la lista")
    public void obtenemosInformacionAcercaDeLaCosaDeLaLista() {
        try {
            LOGGER.info("Verificando que el usuario vea informacion de la opcion seleccionada");
            actor.should(
                    seeThat(theResultId(),containsString("Congratulations! You expressed interest in the Fog cloud"))
            );
            LOGGER.info("informacion de la opcion seleccionada en pantalla");
        } catch (Exception e) {
            LOGGER.error("Error al verificar la aserción: " + e.getMessage());
            Assertions.fail();
        }
        finally {
            quitarDriver();
        }
    }
}
