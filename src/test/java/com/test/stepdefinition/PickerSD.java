package com.test.stepdefinition;

import com.test.setup.SetUp;
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
    @When("Agregamos el mes seleccionado {string} y el dia elegido {string}")
    public void agregamosElMesSeleccionadoYElDiaElegido(String string, String string2) {
        try {
            actor.attemptsTo(
                    pickerTaskONE()
            );
        }catch (Exception e ){}

    }

    @Then("Obtenemos la informacion adecuada en pantalla")
    public void obtenemosLaInformacionAdecuadaEnPantalla() {

    }

}
