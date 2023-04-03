package com.sofkau.stepdefinitions;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.junit.Before;
import sofkau.question.TheResultPhotoDemo;
import sofkau.question.TheResultPicker;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static sofkau.task.PhotoDemoTask.photoDemo;
import static sofkau.task.PickerTask.pickerTask;

public class PickerDemoSD extends SetUp {

    public static Logger LOGGER = Logger.getLogger(InicioSesionSD.class);


    @Before
    public void before() {

        OnStage.setTheStage(new OnlineCast());
    }


    @Given("el usuario esta en el  inicio de la the app")
    public void elUsuarioEstaEnElInicioDeLaTheApp() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));

            LOGGER.info("INICIA LA AUTOMATIZACION");
        } catch (Exception e) {
            LOGGER.info(" fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
        }
    }

    @When("navega hasta la opcion picker demo selecciona una feche mes y dia")
    public void navegaHastaLaOpcionPickerDemoSeleccionaUnaFecheMesYDia() {
        try {
            actor.attemptsTo(
                    pickerTask()
            );
            LOGGER.info("Realiza la peticion");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());
        }
    }

    @Then("el usuario debe ver la informacion del evento de esa fecha")
    public void elUsuarioDebeVerLaInformacionDelEventoDeEsaFecha() {
        try {
            actor.should(
                    seeThat(TheResultPicker.isEqualTo(), containsString(("The crew of Christopher Columbus's ship, the Santa Maria, attempt a mutiny.")))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());

        }
    }


}
