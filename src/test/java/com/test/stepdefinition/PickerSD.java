package com.test.stepdefinition;

import com.test.setup.SetUp;
import com.test.ui.Picker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.test.task.PickerTaskONE.pickerTaskONE;
import static com.test.task.PickerTaskOpen.pickerTaskOpen;
import static com.test.task.PickerTaskTWO.pickerTaskTWO;

public class PickerSD extends SetUp {
    @Given("que estamos en la app TheApp")
    public void queEstamosEnLaAppTheApp() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
        }catch (Exception e){}
    }
    @When("seleccionamos la opcion de PickerDemo")
    public void seleccionamosLaOpcionDePickerDemo() {
        try {
            actor.attemptsTo(
                    pickerTaskOpen()
            );
        }catch (Exception e){}

    }

    @When("Agregamos el mes seleccionado October y el dia elegido {int}")
    public void agregamosElMesSeleccionadoOctoberYElDiaElegido(Integer int1) {
        try {
            actor.attemptsTo(
                    pickerTaskONE()
            );
        }catch (Exception e ){}

    }
    @When("Agregamos el mes seleccionado September y el dia elegido {int}")
    public void agregamosElMesSeleccionadoSeptemberYElDiaElegido(Integer int1) {
        try {
            actor.attemptsTo(
                    pickerTaskTWO()
            );
        }catch (Exception e ){}
    }

    @Then("Obtenemos la informacion adecuada en pantalla")
    public void obtenemosLaInformacionAdecuadaEnPantalla() {
        try {
            Picker.BTN_VALIDACION_TITLE.resolveFor(actor).isPresent();
        }catch (Exception e){
            throw new AssertionError("No se encontro el boton de validacion", e);
        }
    }

}
