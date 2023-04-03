package com.sofkau.stepdefinitions;

import com.sofkau.questions.MensajeRefrescado;
import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import static com.sofkau.questions.MensajeRefrescado.INPUT_MESSAGE;
import static com.sofkau.task.IrAClipboard.irAClipboard;
import static com.sofkau.task.RefrescarClipboard.refrescarClipboard;
import static com.sofkau.task.SetearNuevoMensaje.setearNuevoMensaje;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class ClipBoardStepDefinitions extends SetUp {


    @Given("He ingresado a la interfaz Clipboard")
    public void heIngresadoALaInterfazClipboard() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            actor.attemptsTo(
                    irAClipboard()
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @When("Ingreso el nuevo mensaje que quiero visualizar")
    public void ingresoElNuevoMensajeQueQuieroVisualizar() {
        INPUT_MESSAGE ="Probando Clipboard";
        try {
            actor.attemptsTo(
                    setearNuevoMensaje().conElMensaje(INPUT_MESSAGE)
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @When("Refresco el Texto del clipboard")
    public void refrescoElTextoDelClipboard() {
        try {
            actor.attemptsTo(
                    refrescarClipboard()
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @Then("Deberia ver el mensaje nuevo en el clipboard")
    public void deberiaVerElMensajeNuevoEnElClipboard() {
        try {
            actor.should(
                    seeThat(MensajeRefrescado.isEqualTo(), containsString(String.valueOf(INPUT_MESSAGE)))
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
