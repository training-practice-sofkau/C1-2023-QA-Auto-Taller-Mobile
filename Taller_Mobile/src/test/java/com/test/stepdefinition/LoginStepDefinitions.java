package com.test.stepdefinition;

import com.test.question.ValidarLoginExitoso;
import com.test.question.ValidarLoginFallido;
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

import static com.test.task.LoginTask.loginTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepDefinitions extends SetUp {
    public static Logger LOGGER = Logger.getLogger(LoginStepDefinitions.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        try {
            LOGGER.info("INICIA LA AUTOMATIZACION");
            actor.can(BrowseTheWeb.with(theMobileDevice));

        }catch (Exception exception){
            LOGGER.info(" fallo la configuracion inicial");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }
    @When("el usuario ingresa el usario {string} y el password {string}")
    public void elUsuarioIngresaElUsarioYElPassword(String user, String password) {
        try {
            LOGGER.info("INICIA LA AUTOMATIZACION");
            actor.attemptsTo(
                    loginTask()
                            .conElUsuario(user)
                            .conelPassword(password)
            );
        }catch (Exception exception){
            LOGGER.info(" fallo en el incio de sesión");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }

    }
    @Then("el usuario debera ver el mensaje {string}")
    public void elUsuarioDeberaVerElMensaje(String message) {
        try {
            if (message.equals("You are logged in as alice")) {
                actor.should(
                        seeThat(ValidarLoginExitoso.isEqualTo(), containsString(String.format(message)))
                );
            }
           if (message.equals("Alert")) {
               actor.should(
                       seeThat(ValidarLoginFallido.isEqualTo(), containsString(String.format(message)))
               );
           }

            LOGGER.info("CUMPLE");
        }catch (Exception exception){
            LOGGER.info("Error al realizar la comparacion");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }



}
