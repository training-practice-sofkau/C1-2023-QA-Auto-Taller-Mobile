package com.test.stepdefinition;

import com.test.question.TheResult;
import com.test.setup.SetUp;
import com.test.task.SubtractTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.Before;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class CalcularRestaStepDefinition extends SetUp {

    public static Logger LOGGER= Logger.getLogger(CalcularRestaStepDefinition.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Ingresamos a la calculadora para restar")
    public void ingresamosALaCalculadoraParaRestar() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e){
            LOGGER.warn("Fallo en la automatizacion");
            Assertions.fail(e.getMessage());
        }
    }
    @When("Agregamos los {int}-{int} para realizar una resta")
    public void agregamosLosParaRealizarUnaResta(Integer num1, Integer num2) {
        try {
            actor.attemptsTo(
                    SubtractTask.subtractOperation()
                            .whitFirstNum(num1)
                            .andTheSecondNum(num2)
            );
            LOGGER.info("Realizando resta");
        } catch (Exception e){
            LOGGER.warn("Fallo en la resta");
            Assertions.fail(e.getMessage());
        }
    }
    @Then("Obtenemos el {int} de la resta realizada")
    public void obtenemosElDeLaRestaRealizada(Integer result) {
        try {
            actor.should(
                    seeThat(TheResult.isEqualTo(), containsString(String.valueOf(result)))
            );
            LOGGER.info("Resta realizada");
        } catch (Exception e){
            LOGGER.warn("Resultado incorrecto");
            Assertions.fail(e.getMessage());
        }
    }
}
