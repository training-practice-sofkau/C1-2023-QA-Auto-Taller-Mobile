package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.*;

public class SetMensajeTheApp {

    public static final Target CLIPBOARD = Target
            .the("Clipboard")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Clipboard Demo\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
    public static final Target INPUT_TEXTO = Target
            .the("input texto")
            .located(accessibilityId("messageInput"));



    private SetMensajeTheApp() {
    }
}

