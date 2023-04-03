package com.test.stepdefinition;

import com.test.question.ValidarMensajeFecha;
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

import static com.test.task.PickerDemoTask.pickerDemoTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.notNullValue;

public class PickerDemoStepDefinitions extends SetUp {
    public static Logger LOGGER = Logger.getLogger(PickerDemoStepDefinitions.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que el user se encuentra en la pagina del inicio")
    public void queElUserSeEncuentraEnLaPaginaDelInicio() {
        try {
            LOGGER.info("INICIA LA AUTOMATIZACION");
            actor.can(BrowseTheWeb.with(theMobileDevice));

        }catch (Exception exception){
            LOGGER.info(" fallo la configuracion inicial");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }
    @When("el usuario entra a la funcion Picker Demo y selecciona una fecha")
    public void elUsuarioEntraALaFuncionPickerDemoYSeleccionaUnaFecha() {
        try {
            actor.attemptsTo(
                    pickerDemoTask()
            );
        }catch (Exception exception){
            LOGGER.info(" fallo en la nevagacion de la funcionalidad");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }
    @Then("el usuario debera ver un mensaje con informacion de algo ocurrido en la fecha")
    public void elUsuarioDeberaVerUnMensajeConInformacionDeAlgoOcurridoEnLaFecha() {
        try {
            actor.should(
                    seeThat(ValidarMensajeFecha.isEqualTo(), notNullValue())
            );

            LOGGER.info("CUMPLE");
        }catch (Exception exception){
            LOGGER.info("Error al realizar la comparacion");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }
}
