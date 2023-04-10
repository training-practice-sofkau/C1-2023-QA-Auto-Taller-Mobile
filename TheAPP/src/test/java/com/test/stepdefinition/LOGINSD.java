package com.test.stepdefinition;


import com.test.question.TheResultLogin;
import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;
import java.util.logging.Logger;
import static com.test.task.LoginEscreenTask.loginEscreenTask;
import static com.test.task.LoginTask.loginTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;


public class LoginSD extends SetUp {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginSD .class));
    @Given("el usuario està funcionalidad Loggin screen")
    public void elUsuarioEstàFuncionalidadLogginScreen() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            actor.attemptsTo(
                    loginEscreenTask()
            );

        } catch (Exception e) {
            LOGGER.info(" Fallo al abrir app");
            LOGGER.warning(e.getMessage());
            Assertions.fail(e.getMessage());

        }
    }
    @When("ingresa usuario {string} y password {string}")
    public void ingresaUsuarioYPassword(String user, String pass) {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            actor.attemptsTo(
                    loginTask()
                            .conUser(user)
                            .yPass(pass)
            );


        } catch (Exception e) {
            LOGGER.info(" Fallo al ingresar user y pass");
            LOGGER.warning(e.getMessage());
            Assertions.fail(e.getMessage());

        }
    }
    @Then("Obtendra un mensaje de login exitoso")
    public void obtendraUnMensajeDeLoginExitoso() {
            try {
                actor.should(
                        seeThat(TheResultLogin.isEqualTo(), containsString(String.format("Secret Area")))
                );

                LOGGER.info("Prueba realizada con exito ");

            } catch (Exception e) {
                LOGGER.info(" Fallo al realizar la assercion");
                LOGGER.warning(e.getMessage());
                Assertions.fail(e.getMessage());

            }
    }


}
