package com.test.stepdefinition;


import com.sofkau.question.LoginUsuarioMensaje;
import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.apache.log4j.Logger;

import static com.sofkau.task.ClickHomeTask.clickHomeTask;
import static com.sofkau.task.LoginUsuarioTask.loginUsuarioTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

public class TheAppStepDefinition extends SetUp {
    public static Logger LOGGER= Logger.getLogger(TheAppStepDefinition.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("el usuario esta en la aplicacion TheApp")
    public void el_usuario_esta_en_la_aplicacion_the_app() {

        actor.can(BrowseTheWeb.with(theMobileDevice));

        try {
            actor.attemptsTo(
                    clickHomeTask()

            );
            LOGGER.info("El usuario ingresa a la seccion del loggin");

        } catch (Exception e) {
            LOGGER.info("Fallo al realizar el registro en la pagina web");
            LOGGER.info(e.getMessage());
            Assertions.fail("");
        }
    }
    @When("el usuario ingresa usuario {string} y contrasenia {string}")
    public void el_usuario_ingresa_usuario_y_contrasenia(String usuario, String password) {

        try {

            actor.attemptsTo(
                    loginUsuarioTask().conUsuario(usuario)
                            .conPassword(password)
            );

            LOGGER.info("El usuario fue registrado con exito ");

        } catch (Exception e) {
            LOGGER.info("Fallo al realizar el registro en la pagina web");
            LOGGER.info(e.getMessage());
            Assertions.fail("");
        }

    }
    @Then("el usuario debera observar un mensaje")
    public void el_usuario_debera_observar_un_mensaje() {
        try {
            actor.should(
                    seeThat(LoginUsuarioMensaje.isEqualTo(), containsString(String.format("Logout")))
            );

            LOGGER.info("Prueba realizada con exito ");


        } catch (Exception e) {
            LOGGER.info(" Fallo al realizar la assercion");
            LOGGER.info(e.getMessage());
            Assertions.fail("");

        }
    }
}
