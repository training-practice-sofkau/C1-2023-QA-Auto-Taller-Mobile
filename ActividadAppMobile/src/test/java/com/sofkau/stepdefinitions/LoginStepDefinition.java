package com.sofkau.stepdefinitions;
import com.sofkau.questions.LoginExitoso;
import com.sofkau.questions.LoginFallido;
import com.sofkau.questions.ResultadoEchoBox;
import com.sofkau.setup.SetUp;
import com.sofkau.tasks.echobox.FuncionEchoBox;
import com.sofkau.tasks.login.FuncionLogin;
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

import static com.sofkau.questions.ResultadoEchoBox.RESULTADO_ECHO_BOX;
import static com.sofkau.questions.ResultadoEchoBox.resultadoEchoBox;
import static com.sofkau.tasks.echobox.FuncionEchoBox.funcionEchoBox;
import static com.sofkau.tasks.echobox.FuncionEchoBox.mensaje;
import static com.sofkau.tasks.echobox.NavegarAEchoBox.navegarAEchoBox;
import static com.sofkau.tasks.login.FuncionLogin.funcionLogin;
import static com.sofkau.tasks.login.NavegarALogin.navegarALogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsString;
public class LoginStepDefinition extends SetUp{
    public static Logger LOGGER = Logger.getLogger(String.valueOf(LoginStepDefinition.class));

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que el usuario ingresa a la aplicacion v1100")
    public void queElUsuarioIngresaALaAplicacionV1100() {
        try {
            LOGGER.info("Inicia la automatizacion");
            actor.can(BrowseTheWeb.with(theMobileDevice));
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @When("entra a la funcionalidad login screen")
    public void entraALaFuncionalidadLoginScreen() {
        try {
            actor.attemptsTo(
                    navegarALogin()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @When("escribe su {string} y {string}")
    public void escribeSuY(String usuario, String contrasenia) {
        FuncionLogin.us=usuario;
        FuncionLogin.cc=contrasenia;
        try {
            actor.attemptsTo(
                    funcionLogin()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @Then("aparece un {string} que indica si se inicio sesion o no segun si es usuario {int}")
    public void apareceUnQueIndicaSiSeInicioSesionONoSegunSiEsUsuario(String mensaje, Integer registrado) {

        if(registrado==0){
            try {
                actor.should(
                        seeThat(LoginFallido.isEqualTo(),containsString(mensaje))
                );
            }catch (Exception e){
                LOGGER.warning(e.getMessage());
            }
        }else if(registrado==1){
            try{
                actor.should(
                    seeThat(LoginExitoso.isEqualTo(),containsString(mensaje))
                );
            }catch (Exception e){
                LOGGER.warning(e.getMessage());
            }
        }
    }
}
