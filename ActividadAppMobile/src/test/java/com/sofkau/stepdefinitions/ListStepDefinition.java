package com.sofkau.stepdefinitions;

import com.sofkau.questions.RespuestList;
import com.sofkau.setup.SetUp;
import com.sofkau.tasks.list.FuncionList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import java.util.logging.Logger;

import static com.sofkau.tasks.echobox.NavegarAEchoBox.navegarAEchoBox;
import static com.sofkau.tasks.list.FuncionList.funcionList;
import static com.sofkau.tasks.list.NavegarAList.navegarAList;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class ListStepDefinition extends SetUp {

    public static Logger LOGGER = Logger.getLogger(String.valueOf(ListStepDefinition.class));

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que el usuario ingresa a la apk v1100")
    public void queElUsuarioIngresaALaApkV1100() {
        try {
            LOGGER.info("Inicia la automatizacion");
            actor.can(BrowseTheWeb.with(theMobileDevice));
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @When("entra a la funcionalidad list")
    public void entraALaFuncionalidadList() {
        try {
            actor.attemptsTo(
                    navegarAList()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @When("y seleccionar un {string} de la lista")
    public void ySeleccionarUnDeLaLista(String objeto) {
        FuncionList.obj=objeto;
        try{
            actor.attemptsTo(
                    funcionList()
            );
        }catch (Exception e){

        }
    }
    @Then("aparece un {string} que indica que objeto selecciono")
    public void apareceUnQueIndicaQueObjetoSelecciono(String respuesta) {
        try {
            actor.should(
                    seeThat(RespuestList.isEqualTo(),containsString(respuesta))
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
}
