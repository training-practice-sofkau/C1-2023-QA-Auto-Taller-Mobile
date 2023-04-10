package com.test.stepdefinition;

import com.test.setup.SetUp;
import com.test.task.IniciarSesionTask;
import com.test.task.NavegarPhotoDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class LoginStepDefinition extends SetUp {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());}
    @Given("El usuario ingresa a la aplicacion The App del telefono android")
    public void elUsuarioIngresaALaAplicacionTheAppDelTelefonoAndroid() {
        actor.can(BrowseTheWeb.with(theMobileDevice));
    }
    @When("ingreso a la pantalla de inicio de sesion y escribo un {string} y {string} validos")
    public void ingresoALaPantallaDeInicioDeSesionYEscriboUnYValidos(String string, String string2) {
        actor.attemptsTo(
                IniciarSesionTask.iniciarSesionTask()
        );
    }
    @Then("el usuario deberia ser redirigido y ver el siguiente mensaje {string}")
    public void elUsuarioDeberiaSerRedirigidoYVerElSiguienteMensaje(String string) {

    }
    @When("El usuario navega hasta la funcionalidad Login Screen e introduce un {string} y {string} invalidos")
    public void elUsuarioNavegaHastaLaFuncionalidadLoginScreenEIntroduceUnYInvalidos(String string, String string2) {
        actor.attemptsTo(
                IniciarSesionTask.iniciarSesionTask()
        );
    }
    @Then("el usuario deberia ver el siguiente mensaje {string}")
    public void elUsuarioDeberiaVerElSiguienteMensaje(String string) {

    }

}
