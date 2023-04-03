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

import static com.sofkau.questions.EchoBoxResult.echoBoxResult;
import static com.sofkau.tasks.NavigateToEchoBox.navigateToEchoBox;
import static com.sofkau.tasks.EnterText.enterText;
import static com.sofkau.util.Constants.ECHO_BOX_SAVED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class EchoBoxStepDefinition extends SetUp {

    public static Logger LOGGER = Logger.getLogger(EchoBoxStepDefinition.class);
    @Before
    public void before(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario ingresa a la funcionalidad de Echo Box")
    public void elUsuarioIngresaALaFuncionalidadDeEchoBox() {
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
    @When("ingresa un texto {string} en el campo habilitado")
    public void ingresaUnTextoEnElCampoHabilitado(String texto) {
        try {
            actor.attemptsTo(
                    navigateToEchoBox(),
                    enterText()
                            .conElText(texto)

            );
        } catch (Exception e){
            LOGGER.info("Fallo en la escritura del texto");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
            quitarDriver();
        }
    }
    @Then("el usuario debe visualizar en pantalla un mensaje del texto guardado")
    public void elUsuarioDebeVisualizarEnPantallaUnMensajeDelTextoGuardado() {
        try {
            actor.should(
                    seeThat(echoBoxResult(), equalTo(ECHO_BOX_SAVED))
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
