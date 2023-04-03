package com.sofkau.stepdefinitions;

import com.sofkau.questions.ResultadoWebView;
import com.sofkau.questions.ResultadoWebViewClear;
import com.sofkau.setup.SetUp;
import com.sofkau.tasks.webview.FuncionWebView;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import static com.sofkau.tasks.webview.FuncionWebView.button;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import java.util.logging.Logger;
import static org.hamcrest.Matchers.containsString;
import static com.sofkau.tasks.echobox.NavegarAEchoBox.navegarAEchoBox;
import static com.sofkau.tasks.webview.FuncionWebView.funcionWebView;
import static com.sofkau.tasks.webview.NavegarAWebView.navegarAWebView;

public class WebViewStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf(WebViewStepDefinition.class));
    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario ingresa a la aplicacion movil v1100")
    public void queElUsuarioIngresaALaAplicacionMovilV1100() {
        try {
            LOGGER.info("Inicia la automatizacion");
            actor.can(BrowseTheWeb.with(theMobileDevice));
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @When("entra a la funcionalidad webview")
    public void entraALaFuncionalidadWebview() {
        try {
            actor.attemptsTo(
                    navegarAWebView()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @When("escribe una {string} y presiono el {string}")
    public void escribeUnaYPresionoEl(String url, String boton) {
        FuncionWebView.zelda=url;
        FuncionWebView.button=boton;
        try {
            actor.attemptsTo(
                    funcionWebView()
            );

        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @Then("aparece un {string} segun el boton presionado")
    public void apareceUnSegunElBotonPresionado(String mensaje) {
        if(button.equals("Go")){
            try {
                actor.should(
                        seeThat(ResultadoWebView.isEqualTo(), containsString(mensaje))
                );
            }catch (Exception e){
                LOGGER.warning(e.getMessage());
            }
        }else if(button.equals("Clear")){
            try {
                actor.should(
                        seeThat(ResultadoWebViewClear.isEqualTo(), containsString(mensaje))
                );
            }catch (Exception e){
                LOGGER.warning(e.getMessage());
            }
        }

    }
}
