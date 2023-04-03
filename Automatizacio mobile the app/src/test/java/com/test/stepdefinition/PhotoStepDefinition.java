package com.test.stepdefinition;

import com.test.question.MensajeDeConsultaDates;
import com.test.question.MensajeDeConsultaFoto;
import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.Before;

import static com.test.task.NavigateToPhoto.navigateToPhoto;
import static com.test.task.SeleccionarFoto.seleccionarFoto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.notNullValue;

public class PhotoStepDefinition extends SetUp {

    public static Logger LOGGER= Logger.getLogger(PhotoStepDefinition.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Se ingresa a la aplicacion para buscar fotos")
    public void seIngresaALaAplicacionParaBuscarFotos() {
        try {
            actor.can(BrowseTheWeb.with(theMobileDevice));
            LOGGER.info("Inicio de la automatizacion");
        } catch (Exception e){
            LOGGER.warn("Fallo en la automatizacion");
            Assertions.fail(e.getMessage());
        }
    }
    @When("Se da click en la foto {int}")
    public void seDaClickEnLaFoto(Integer num) {
        try{
            actor.attemptsTo(
                navigateToPhoto(),
                seleccionarFoto()
                        .conLaFoto(num)
        );
            LOGGER.info("Foto seleccionada");
        } catch (Exception e){
            LOGGER.warn("Fallo seleccionando la foto");
            Assertions.fail(e.getMessage());
        }
    }
    @Then("Se mostrara un dato acerca de esa foto")
    public void seMostraraUnDatoAcercaDeEsaFoto() {
        try {
            actor.should(
                    seeThat("Mensaje de aprendizaje",
                            MensajeDeConsultaFoto.isEqualTo(), notNullValue())
            );
            LOGGER.info("Asercion exitosa");
        } catch (Exception e){
            LOGGER.warn("Fallo en la asercion");
            Assertions.fail(e.getMessage());
        }
    }
}
