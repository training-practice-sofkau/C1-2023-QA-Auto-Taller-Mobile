package com.sofkau.setup;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.sofkau.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {

    @Managed(driver = "Appium")
    protected WebDriver theMobileDevice;

    protected void setupDevice() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR).can(BrowseTheWeb.with(theMobileDevice));
    }
}