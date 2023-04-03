package com.test.stepdefinition;

import com.test.setup.SetUp;
import com.test.ui.List;
import com.test.ui.Photo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.test.task.PhotoTask.photoTask;
import static com.test.task.PhotoTaskOpen.photoTaskOpen;

public class PhotoSD extends SetUp {
    @Given("se ingresa a la app TheApp")
    public void seIngresaALaAppTheApp() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
        }catch (Exception e){
            throw new AssertionError("ocurrio un error", e);
        }

    }
    @When("seleccionamos la opcion de PhotoDemo")
    public void seleccionamosLaOpcionDePhotoDemo() {
        try {
            actor.attemptsTo(
                    photoTaskOpen()
            );
        }catch (Exception e){
            throw new AssertionError("ocurrio un error", e);
        }

    }
    @When("elegimos la fotografia de preferencia")
    public void elegimosLaFotografiaDePreferencia() {
        try {
            actor.attemptsTo(
                    photoTask()
            );
        }catch (Exception e){
            throw new AssertionError("ocurrio un error", e);
        }

    }
    @Then("Obtenemos un texto acorde a la foto en pantalla")
    public void obtenemosUnTextoAcordeALaFotoEnPantalla() {
        try {
            Photo.BTN_CONFIRMACION_PHOTO.resolveFor(actor).isPresent();
        }catch (Exception e){
            throw new AssertionError("No se encontro el boton de confirmacion", e);
        }
    }

}
