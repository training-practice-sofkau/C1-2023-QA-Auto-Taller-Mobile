package com.test.stepdefinition;

import com.test.question.MensajeLoginExitoso;
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

import static com.test.task.GuardarEnPortapapeles.guardarEnPortapapeles;
import static com.test.task.NavigateToClipboard.navigateToClipboard;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ClipBoardStepDefinition extends SetUp {

    public static Logger LOGGER= Logger.getLogger(ClipBoardStepDefinition.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Se ingresa a la aplicacion para guardar informacion")
    public void seIngresaALaAplicacionParaGuardarInformacion() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e){
            LOGGER.warn("Fallo en la automatizacion");
            Assertions.fail(e.getMessage());
        }
    }
    @When("Se llena el campo de {string} se oprime el boton guardar y el boton refresh")
    public void seLlenaElCampoDeSeOprimeElBotonGuardarYElBotonRefresh(String text) {
        try {
            actor.attemptsTo(
                    navigateToClipboard(),
                    guardarEnPortapapeles()
                            .conElTexto(text)
            );
            LOGGER.info("Texto guardado en portapapeles");
        } catch (Exception e){
            LOGGER.warn("Texto no guardado");
            Assertions.fail(e.getMessage());
        }
    }
    @Then("El portapapeles muestra la {string} guardada")
    public void elPortapapelesMuestraLaGuardada(String text) {
        try {
            actor.should(
                    seeThat("Mensaje guardado en portapapeles",
                            MensajeLoginExitoso.isEqualTo(),
                            equalTo(text))
            );
            LOGGER.info("Mensaje guardado, asercion exitosa");
        } catch (Exception e){
            LOGGER.warn("Texto no guardado");
            Assertions.fail(e.getMessage());
        }
    }
}
