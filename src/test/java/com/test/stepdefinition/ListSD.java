package com.test.stepdefinition;

import com.test.setup.SetUp;
import com.test.ui.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import static com.test.task.ListTask.listTask;
import static com.test.task.ListTaskOpen.listTaskOpen;
import static com.test.ui.List.BTN_CONFIRM;


public class ListSD extends SetUp {
    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que accedemos a la app TheApp")
    public void queAccedemosALaAppTheApp() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
        }catch (Exception e){
            throw new AssertionError("ocurrio un error al abrir la app", e);
        }

    }
    @When("seleccionamos la opcion de ListDemo")
    public void seleccionamosLaOpcionDeListDemo() {
        try {
            actor.attemptsTo(
                    listTaskOpen()
            );
        }catch (Exception e){
            throw new AssertionError("ocurrio un error", e);
        }

    }
    @When("elegimos la opcion de FOG")
    public void elegimosLaOpcionDeFOG() {
        try {
            actor.attemptsTo(
                    listTask()
            );
        }catch (Exception e){
            throw new AssertionError("ocurrio un error", e);
        }

    }
    @Then("Obtenemos un mensaje en pantalla de confirmacion")
    public void obtenemosUnMensajeEnPantallaDeConfirmacion() {
        try {
            List.BTN_CONFIRM.resolveFor(actor).isPresent();
        }catch (Exception e){
            throw new AssertionError("No se encontro el boton de confirmacion", e);
        }
    }
}
