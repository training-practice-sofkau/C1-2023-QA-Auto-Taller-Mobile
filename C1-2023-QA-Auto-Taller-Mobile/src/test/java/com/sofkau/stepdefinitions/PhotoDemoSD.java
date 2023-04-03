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
import sofkau.question.TheResultlogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static sofkau.task.PhotoDemoTask.photoDemo;

public class PhotoDemoSD extends SetUp {

    public static Logger LOGGER = Logger.getLogger(InicioSesionSD.class);


    @Before
    public void before() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario esta en la pagina de inicio de la the app")
    public void elUsuarioEstaEnLaPaginaDeInicioDeLaTheApp() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));

            LOGGER.info("INICIA LA AUTOMATIZACION");
        } catch (Exception e) {
            LOGGER.info(" fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
        }
    }

    @When("navega hasta la opcion photo selecciona una photo para ver las descrripcion de cada una de ellas")
    public void navegaHastaLaOpcionPhotoSeleccionaUnaPhotoParaVerLasDescrripcionDeCadaUnaDeEllas() {
        try {
            actor.attemptsTo(
                    photoDemo()
            );
            LOGGER.info("Realiza la peticion");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());
        }
    }

    @Then("el usuario debe ver la {string} de la photo")
    public void elUsuarioDebeVerLaDeLaPhoto(String informacion) {
        try {
            actor.should(
                    seeThat(TheResultPhotoDemo.isEqualTo(), containsString((informacion)))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());

        }

    }

}
