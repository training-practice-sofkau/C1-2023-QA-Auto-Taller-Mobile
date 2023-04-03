package com.test.stepdefinition;

import com.test.question.VerificarNoticia;
import com.test.setup.SetUp;
import com.test.task.NavegarPhotoDemo;
import com.test.task.NavegarPickerDemoTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Before;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.Matchers.is;

import static com.test.ui.PickerDemoUI.MENSAJE_ASERCION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class PickerDemoStepDefinitions extends SetUp {
    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("El usuario ingresa a la app The App del celular android")
    public void elUsuarioIngresaALaAppTheAppDelCelularAndroid() {
        actor.can(BrowseTheWeb.with(theMobileDevice));
    }
    @When("El usuario navega hasta la funcionalidad Picker Demo y selecciona el mes y el dia del cual desea ver la noticia")
    public void elUsuarioNavegaHastaLaFuncionalidadPickerDemoYSeleccionaElMesYElDiaDelCualDeseaVerLaNoticia() {
        actor.attemptsTo(
                NavegarPickerDemoTask.navegarPickerDemoTask()
        );
    }
    @Then("deberia ver una noticia relevante para la fecha que escogio")
    public void deberiaVerUnaNoticiaRelevanteParaLaFechaQueEscogio() {
        String patronTexto = "On this day \\(11/5\\) in \\d{4}...";
        actor.attemptsTo(
                WaitUntil.the(MENSAJE_ASERCION, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(5).seconds()
        );
        actor.should(seeThat("verificar noticia", VerificarNoticia.conPatron(MENSAJE_ASERCION, patronTexto), is(true)));
    }

}
