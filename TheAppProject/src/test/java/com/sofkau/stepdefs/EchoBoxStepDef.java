package com.sofkau.stepdefs;

import com.sofkau.setup.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EchoBoxStepDef extends Setup {

    @Given("I was on the home screen")
    public void iWasOnTheHomeScreen() {
    }

    @When("I select Echo Box option")
    public void iSelectEchoBoxOption() {
    }

    @And("I type {string}")
    public void iTypeText(String text) {
    }

    @Then("I will see the same text {string}")
    public void iWillSeeTheSameTextSame(String same) {
    }
}