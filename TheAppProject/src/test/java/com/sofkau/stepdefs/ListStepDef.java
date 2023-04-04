package com.sofkau.stepdefs;

import com.sofkau.setup.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.questions.IsThereInfo.isThereInfo;
import static com.sofkau.tasks.GoToList.goToList;
import static com.sofkau.tasks.ViewCirrusInfo.viewCirrusInfo;
import static com.sofkau.utils.Constants.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ListStepDef extends Setup {
    private final Logger log = LoggerFactory.getLogger(ListStepDef.class);

    @Given("I was on home-screen")
    public void iWasOnHomeScreen() {
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

    @When("I select list option")
    public void iSelectListOption() {
        try {
            log.info("Select list");
            theActorInTheSpotlight().attemptsTo(
                    goToList()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @And("I select Cirrus")
    public void iSelectCirrus() {
        try {
            log.info("Select Cirrus");
            theActorInTheSpotlight().attemptsTo(
                    viewCirrusInfo()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Then("I will see info about Cirrus")
    public void iWillSeeInfoAboutCirrus() {
        try {
            theActorInTheSpotlight().should(
                    seeThat("Info about Cirrus cloud",
                            isThereInfo(), equalTo(MESSAGE))
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