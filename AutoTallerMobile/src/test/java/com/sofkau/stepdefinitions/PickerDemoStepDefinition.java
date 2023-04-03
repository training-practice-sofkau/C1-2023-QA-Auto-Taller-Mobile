package com.sofkau.stepdefinitions;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.Before;

import static com.sofkau.tasks.NavigateToPickerDemo.navigateToPickerDemo;
import static com.sofkau.tasks.PickDate.pickDate;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.notNullValue;

public class PickerDemoStepDefinition extends SetUp {

    public static Logger LOGGER = Logger.getLogger(PickerDemoStepDefinition.class);

    @Before
    public void before(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario ingresa a la aplicacion TheApp")
    public void elUsuarioIngresaALaAplicacionTheApp() {
        try {
            setUplog4j();
            actor.can(BrowseTheWeb.with(theMobileDevice));
            LOGGER.info("INICIO AUTOMATIZACION");
        } catch (Exception e){
            LOGGER.info("Fallo en la configuracion inicial");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();
        }
    }
    @When("nave hasta la funcionalidad PickerDemo, luego ingresa una fecha")
    public void naveHastaLaFuncionalidadPickerDemoLuegoIngresaUnaFecha() {
        try {
            actor.attemptsTo(
                    navigateToPickerDemo(),
                    pickDate()
            );
        } catch (Exception e){
            LOGGER.info("Fallo al seleccionar la fecha");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();
        }
    }
    @Then("debe observar eventos sucedidos en la fecha seleccionada")
    public void debeObservarEventosSucedidosEnLaFechaSeleccionada() {
        try {
            actor.should(
                    seeThat(act -> pickDate(), notNullValue())
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e){
            LOGGER.info("Fallo en la comparacion de resultados");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();
        }
    }

}
