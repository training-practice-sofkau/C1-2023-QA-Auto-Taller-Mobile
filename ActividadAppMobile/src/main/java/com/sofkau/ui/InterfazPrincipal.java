package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;

public class InterfazPrincipal {

    public static final Target ECHO_BOX = Target.the("Funcionalidad echo box")
            .located(id("//android.view.ViewGroup[@content-desc=\"Echo Box\"]/android.widget.TextView[1]"));
}
