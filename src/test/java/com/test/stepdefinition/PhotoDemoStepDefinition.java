package com.test.stepdefinition;

import com.test.question.PhotoDemo;
import com.test.setup.SetUp;
import com.test.task.NavegarPhotoDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Before;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PhotoDemoStepDefinition extends SetUp {
    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("El usuario ingresa a la aplicacion The App del celular android")
    public void elUsuarioIngresaALaAplicacionTheAppDelCelularAndroid() {
        actor.can(BrowseTheWeb.with(theMobileDevice));
    }

    @When("El usuario navega hasta la funcionalidad Photo Demo")
    public void elUsuarioNavegaHastaLaFuncionalidadPhotoDemo() {
        actor.attemptsTo(
                NavegarPhotoDemo.navegarPhotoDemo()
        );
    }

    @Then("deberia ver las fotos disponibles en la galeria")
    public void deberiaVerLasFotosDisponiblesEnLaGaleria() {
        int numberOfPhotos = 6;
        for (int i = 1; i <= numberOfPhotos; i++) {
            actor.attemptsTo(WaitUntil.the(PhotoDemo.photo(i), isVisible()).forNoMoreThan(5).seconds());
        }

    }
}

