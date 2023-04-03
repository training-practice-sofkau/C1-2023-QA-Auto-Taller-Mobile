package com.sofkau.stepdefinitions;

import com.sofkau.questions.SelectedPhotoMessage;
import com.sofkau.questions.StuffSelectedMessage;
import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;
import org.bouncycastle.jce.exception.ExtCertificateEncodingException;

import static com.sofkau.task.IrALogin.irALogin;
import static com.sofkau.task.IrAPhotoDemo.irAPhotoDemo;
import static com.sofkau.task.SeleccionarPhoto.seleccionarPhoto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class ViewPhotoStepDefinitions extends SetUp {

    @Given("He ingresado a la interfaz de Photo Demo")
    public void heIngresadoALaInterfazDePhotoDemo() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            actor.attemptsTo(
                    irAPhotoDemo()
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @When("Selecciono la foto {string}")
    public void seleccionoLaFoto(String idPhoto) {
        try {
            actor.attemptsTo(
                    seleccionarPhoto().elId(idPhoto)
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @Then("Deberia ver una descripcion de la foto seleccionada, {string}")
    public void deberiaVerUnaDescripcionDeLaFotoSeleccionada(String message) {
        try {
            actor.should(
                    seeThat(SelectedPhotoMessage.isEqualTo(), containsString(String.valueOf(message)))
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }

}
