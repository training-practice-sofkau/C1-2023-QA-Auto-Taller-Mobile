package com.sofkau.stepdefs;

import com.sofkau.setup.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.questions.IsSameText.isSameText;
import static com.sofkau.tasks.GoToEchoBox.goToEchoBox;
import static com.sofkau.tasks.TypeAndSave.typeAndSave;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class EchoBoxStepDef extends Setup {
    private final Logger log = LoggerFactory.getLogger(EchoBoxStepDef.class);

    @Given("I was on the home screen")
    public void iWasOnTheHomeScreen() {
        try {
            log.info("Init scenario");
            setupDevice();
        } catch (Exception e) {
            log.error("Wrong Setup provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @When("I select Echo Box option")
    public void iSelectEchoBoxOption() {
        try {
            log.info("Select echo box");
            theActorInTheSpotlight().attemptsTo(
                    goToEchoBox()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @And("I type {string}")
    public void iTypeText(String text) {
        try {
            log.info("Type something");
            theActorInTheSpotlight().attemptsTo(
                    typeAndSave(text)
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Then("I will see the same text {string}")
    public void iWillSeeTheSameTextSame(String same) {
        try {
            theActorInTheSpotlight().should(
                    seeThat("Same text",
                            isSameText(), equalTo(same))
            );
            log.info("Test passed");
        } catch (Exception e) {
            log.error("Test failed");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        } finally {
            log.info("Test completed");
        }
    }
}