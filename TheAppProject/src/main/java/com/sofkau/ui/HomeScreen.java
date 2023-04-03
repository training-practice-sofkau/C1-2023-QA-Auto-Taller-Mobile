package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;

public class HomeScreen {

    public static final Target LOCATOR = Target.the("LOCATOR")
            .located(id("SOME_LOCATOR"));
}