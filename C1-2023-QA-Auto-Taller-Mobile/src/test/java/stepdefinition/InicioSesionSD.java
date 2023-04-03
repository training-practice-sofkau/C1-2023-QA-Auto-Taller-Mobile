package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.junit.Before;
import setup.SetUp;

public class InicioSesionSD extends SetUp {




    public static Logger LOGGER = Logger.getLogger(InicioSesionSD.class);


    @Before
    public void before() {

        OnStage.setTheStage(new OnlineCast());
    }



    @Given("el usuario esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio() {

    }

    @When("el usuario envia los campos de iniciar sesion {string}, {string}")
    public void elUsuarioEnviaLosCamposDeIniciarSesion(String string, String string2) {

    }

    @Then("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {

    }


}
