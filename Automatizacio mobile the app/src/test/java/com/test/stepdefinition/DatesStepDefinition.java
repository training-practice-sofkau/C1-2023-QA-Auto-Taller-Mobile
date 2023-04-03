package com.test.stepdefinition;

import com.test.question.MensajeDeConsultaDates;
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

import static com.test.task.NavigateToDates.navigateToDates;
import static com.test.task.SeleccionarDate.seleccionarDate;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.notNullValue;

public class DatesStepDefinition extends SetUp {

    public static Logger LOGGER= Logger.getLogger(DatesStepDefinition.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Se ingresa a la aplicacion para buscar fechas")
    public void seIngresaALaAplicacionParaBuscarFechas() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e){
            LOGGER.warn("Fallo en la automatizacion");
            Assertions.fail(e.getMessage());
        }
    }
    @When("Se llena el campo de {int} el campo {int} y se oprime el boton buscar")
    public void seLlenaElCampoDeElCampoYSeOprimeElBotonBuscar(Integer mes, Integer dia) {
        try {
            actor.attemptsTo(
                    navigateToDates(),
                    seleccionarDate()
                            .conElMes(mes)
                            .yElDia(dia)
            );
            LOGGER.info("Dia y mes seleccionados");
        } catch (Exception e){
            LOGGER.warn("Fallo en la seleccion");
            Assertions.fail(e.getMessage());
        }
    }
    @Then("Se mostrara un dato acerca de ese dia")
    public void seMostraraUnDatoAcercaDeEseDia() {
        try {
            actor.should(
                    seeThat("Mensaje de aprendizaje",
                            MensajeDeConsultaDates.isEqualTo(), notNullValue())
            );
            LOGGER.info("Asercion exitosa");
        } catch (Exception e){
            LOGGER.warn("Fallo en la asercion");
            Assertions.fail(e.getMessage());
        }
    }
}
