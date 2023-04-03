package com.sofkau.stepdefinitions;

import com.sofkau.questions.LogOutButton;
import com.sofkau.questions.StuffSelectedMessage;
import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import static com.sofkau.task.IrAListStuff.irAListStuff;
import static com.sofkau.task.SeleccionarStuff.seleccionarStuff;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;


public class ListStuffStepDefinitions extends SetUp {
    @Given("He ingresado a la interfaz de Listar")
    public void heIngresadoALaInterfazDeListar() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            actor.attemptsTo(
                    irAListStuff()
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @When("Selecciono el stuff deseado {string}")
    public void seleccionoElStuffDeseado(String stuff) {
        try {
            actor.attemptsTo(
                    seleccionarStuff().elStuff(stuff)
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }

    }
    @Then("Deberia ver un mensaje indicando que elegi el stuff")
    public void deberiaVerUnMensajeIndicandoQueElegiElStuff() {
        try {
            actor.should(
                    seeThat(StuffSelectedMessage.isEqualTo(), containsString(String.valueOf("Your Cloud Selection")))
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
