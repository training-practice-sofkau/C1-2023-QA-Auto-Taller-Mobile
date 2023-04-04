package com.sofkau.stepdefs;

import com.sofkau.setup.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.questions.IsThereDescription.isThereDescription;
import static com.sofkau.tasks.GoToPhoto.goToPhoto;
import static com.sofkau.tasks.SelectPhoto.selectPhoto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class PhotoStepDef extends Setup {
    private final Logger log = LoggerFactory.getLogger(PhotoStepDef.class);

    @Given("I was on home screen")
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

    @When("I select photo option")
    public void iSelectPhotoOption() {
        try {
            log.info("Select photo");
            theActorInTheSpotlight().attemptsTo(
                    goToPhoto()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @And("I select the first pic")
    public void iSelectTheFirstPic() {
        try {
            log.info("Look for first pic");
            theActorInTheSpotlight().attemptsTo(
                    selectPhoto()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Then("I will see a description of the pic")
    public void iWillSeeADescriptionOfThePic() {
        try {
            theActorInTheSpotlight().should(
                    seeThat("Description of a photo",
                            isThereDescription(), isA(String.class))
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