package com.test.stepdefinition;

import com.test.question.TheResult;
import com.test.setup.SetUp;
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
    @When("Agregamos los {string}")
    public void agregamosLos(String textos) {
        try {
            actor.attemptsTo(
                    clipBoardTask().conElMensaje(textos)
            );
        }catch(Exception e){
            throw new AssertionError("ocurrio un error", e);
        }

    }
    @Then("Obtenemos los mismos {string} en pantalla")
    public void obtenemosLosMismosEnPantalla(String textosescritos) {


    }
}
