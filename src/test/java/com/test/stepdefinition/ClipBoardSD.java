package com.test.stepdefinition;

import com.test.question.TheResult;
import com.test.setup.SetUp;
import com.test.ui.ClipBoard;
import com.test.ui.Photo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import static com.test.task.ClipBoardTask.clipBoardTask;
import static com.test.task.ClipBoardTaskOpen.clipBoardTaskOpen;


public class ClipBoardSD extends SetUp {
   @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Ingresamos a la app TheApp")
    public void ingresamosALaAppTheApp() {
        try{
            actor.can(BrowseTheWeb.with(theMobileDevice));
        }catch (Exception e){
            throw new AssertionError("ocurrio un error al abrir la app", e);

        }


    }
    @When("seleccionamos la opcion de Clipboard Demo")
    public void seleccionamosLaOpcionDeClipboardDemo() {
        try {
            actor.attemptsTo(
                    clipBoardTaskOpen()
            );
        }catch (Exception e){}
    }
    @When("Agregamos el texto deseado")
    public void agregamosElTextoDeseado() {
        try {
            actor.attemptsTo(
                    clipBoardTask()
            );
        }catch(Exception e){
            throw new AssertionError("ocurrio un error", e);
        }

    }
    @Then("Obtenemos el mismo texto guardado en pantalla")
    public void obtenemosElMismoTextoGuardadoEnPantalla() {
        try{
            ClipBoard.BTN_VALIDATION1.resolveFor(actor).isPresent();
        }catch (Exception e){
            throw new AssertionError("No se encontro el boton de confirmacion", e);
        }

    }
}
