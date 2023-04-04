package com.sofkau.stepdefs;

import com.sofkau.setup.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.questions.LoggedIn.loggedIn;
import static com.sofkau.tasks.EnterCredentials.enterCredentials;
import static com.sofkau.tasks.GoToLogin.goToLogin;
import static com.sofkau.tasks.Login.login;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class LoginStepDef extends Setup {
    private final Logger log = LoggerFactory.getLogger(LoginStepDef.class);

    @Given("I was on the home-screen")
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

    @When("I select login option")
    public void iSelectLoginOption() {
        try {
            log.info("Select login");
            theActorInTheSpotlight().attemptsTo(
                    goToLogin()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @And("I enter the credentials")
    public void iEnterTheCredentials() {
        try {
            log.info("Enter credentials");
            theActorInTheSpotlight().attemptsTo(
                    enterCredentials(),
                    login()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Then("I will see a logged in message")
    public void iWillSeeALoggedInMessage() {
        try {
            theActorInTheSpotlight().should(
                    seeThat("A secret area",
                            loggedIn(), equalTo("Secret Area"))
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