package com.sofkau.stepdefinition;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.question.ElMensaje.elMensaje;
import static com.sofkau.question.ElTitulo.elTitulo;
import static com.sofkau.task.ElegirDia.elegirDia;
import static com.sofkau.task.ElegirMes.elegirMes;
import static com.sofkau.task.FinalizarIngresarPicker.finalizarIngresarPicker;
import static com.sofkau.task.IngresarPickerDemo.ingresarPickerDemo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.notNullValue;

public class DatosCuriososStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(DatosCuriososStepDefinition.class);

    @Given("El usuario esta en la aplicacion")
    public void elUsuarioEstaEnLaAplicacion() {
        try {
            configurarCelular();
            LOGGER.info("Inicia la automatizacion");
        } catch (Exception e) {
            LOGGER.info("Fallo la configuracion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @Given("El usuario esta en Picker Demo")
    public void elUsuarioEstaEnPickerDemo() {
        try {
            ACTOR.attemptsTo(
                    ingresarPickerDemo()
            );
            LOGGER.info("Ingresa a Picker Demo");
        } catch (Exception e) {
            LOGGER.info("Fallo el entrar en la opcion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("Escoge el {int} y el {int} que desea consultar")
    public void escogeElYElQueDeseaConsultar(Integer intUno, Integer intDos) {
        try {
            ACTOR.attemptsTo(
                    elegirMes().enElMes(intUno),
                    elegirDia().conElDia(intDos),
                    finalizarIngresarPicker()
            );
            LOGGER.info("Elige dia y mes");
        } catch (Exception e) {
            LOGGER.info("Fallo el escoger mes y dia");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @Then("obtiene un {string} y un mensaje")
    public void obtieneUnYUnMensaje(String string) {
        try {
            ACTOR.should(
                    seeThat(elTitulo(),containsString(string)),
                    seeThat(elMensaje(),notNullValue())
            );
            LOGGER.info("Hace la comparacion");
        } catch (Exception e) {
            LOGGER.info("Fallo la comparacion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        } finally {
            quitarDriver();
        }
    }
}
