package com.test.stepdefinition;

import com.test.setup.SetUp;
import com.test.task.PlusTask;
import com.test.task.SumaTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class ComprobarLogicaCalculadora extends SetUp {

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Ingresamos a la calculadora del telefono android")
    public void ingresamosALaCalculadoraDelTelefonoAndroid() {
        actor.can(BrowseTheWeb.with(theMobileDevice));
    }
    @When("Agregamos los {int}+{int}.{int} que queremos validar")
    public void agregamosLosQueQueremosValidar(Integer int1, Integer int2, Integer int3) {
        actor.attemptsTo(
                SumaTask.operacionSuma()
        );
    }
    @Then("Obtenemos el {double} y los verificamos")
    public void obtenemosElYLosVerificamos(Double double1) {

    }
}
