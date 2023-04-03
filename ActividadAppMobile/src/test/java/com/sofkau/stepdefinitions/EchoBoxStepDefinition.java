package com.sofkau.stepdefinitions;

import com.sofkau.questions.ResultadoEchoBox;
import com.sofkau.setup.SetUp;
import com.sofkau.tasks.echobox.FuncionEchoBox;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;

import java.util.logging.Logger;


import static com.sofkau.tasks.echobox.FuncionEchoBox.funcionEchoBox;
import static com.sofkau.tasks.echobox.FuncionEchoBox.mensaje;
import static com.sofkau.tasks.echobox.NavegarAEchoBox.navegarAEchoBox;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsString;


public class EchoBoxStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf(EchoBoxStepDefinition.class));

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que el usuario ingresa a la app v1100")
    public void queElUsuarioIngresaALaAppV1100() {
        try {
            LOGGER.info("Inicia la automatizacion");
            actor.can(BrowseTheWeb.with(theMobileDevice));
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }

    @When("entra a la funcionalidad echo box")
    public void entraALaFuncionalidadEchoBox() {
        try {
            actor.attemptsTo(
                    navegarAEchoBox()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @When("escribe y guarda un {string}")
    public void escribeYGuardaUn(String msj) {
        FuncionEchoBox.mensaje=msj;
        try {
            actor.attemptsTo(
                    funcionEchoBox()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }
    @Then("obtenemos un mensaje de {string}")
    public void obtenemosUnMensajeDe(String respuesta) {
        try {
            actor.should(
                    seeThat(ResultadoEchoBox.isEqualTo(),containsString(respuesta))
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
}
