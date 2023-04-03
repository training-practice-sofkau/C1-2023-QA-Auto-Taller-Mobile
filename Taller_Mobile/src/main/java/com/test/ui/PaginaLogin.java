package com.test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.xpath;

public class PaginaLogin {
    public static final Target BTN_LOGIN_SCREEN = Target
            .the("Pantalla de inicio de sesión")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

    public static final Target CAMPO_USER = Target
            .the("Campo escribir usuario")
            .located(accessibilityId("username"));

    public static final Target CAMPO_PASSWORD = Target
            .the("Campo escribir password")
            .located(accessibilityId("password"));

    public static final Target BTN_LOGIN = Target
            .the("Boton login")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView"));
}
