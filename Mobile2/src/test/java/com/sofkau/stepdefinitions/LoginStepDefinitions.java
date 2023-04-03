package com.sofkau.stepdefinitions;

import com.sofkau.questions.LogOutButton;
import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.assertj.core.api.Assertions;
import org.junit.Before;

import static com.sofkau.task.IniciarSesion.iniciarSesion;
import static com.sofkau.task.IrALogin.irALogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepDefinitions extends SetUp {

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("He ingresado a la interfaz de Login")
    public void heIngresadoALaInterfazDeLogin() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            actor.attemptsTo(
                    irALogin()
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @When("Ingresamos los datos de inicio de sesion")
    public void ingresamosLosDatosDeInicioDeSesion() {
        try {
            actor.attemptsTo(
                    iniciarSesion().conUser("alice")
                            .conPass("mypassword")
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @Then("Obtenemos el correcto mensaje de inicio exitoso")
    public void obtenemosElCorrectoMensajeDeInicioExitoso() {
        try {
            actor.should(
                    seeThat(LogOutButton.isEqualTo(), containsString(String.valueOf("Logout")))
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
