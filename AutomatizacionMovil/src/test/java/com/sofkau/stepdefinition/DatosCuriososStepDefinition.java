package com.sofkau.stepdefinition;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class DatosCuriososStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(DatosCuriososStepDefinition.class);
    @Given("El usuario esta en la aplicacion")
    public void elUsuarioEstaEnLaAplicacion() {
        try {
            configurarCelular();
        }catch (Exception e){
            LOGGER.info("Fallo la configuracion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Given("El usuario esta en Picker Demo")
    public void elUsuarioEstaEnPickerDemo() {
        try {

        }catch (Exception e){
            LOGGER.info("Fallo el entrar en la opcion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("Escoge el {int} y el {int} que desea consultar")
    public void escogeElYElQueDeseaConsultar(Integer int1, Integer int2) {
    }
    @Then("obtiene un {string} y un mensaje")
    public void obtieneUnYUnMensaje(String string) {
    }
}
