package com.sofkau.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;


import static org.openqa.selenium.By.xpath;


public class LoginScreen {

    public static final Target BTN_MAYOR_QUE = Target
            .the("Boton mayor que >")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));


    public static final Target NOMBRE_USURIO = Target
            .the("Nombre del usuario")
            .located(AppiumBy.accessibilityId("username"));

    public static final Target PASSWORD_USUARIO = Target
            .the("Contraseña del usuario")
            .located(AppiumBy.accessibilityId("password"));

    public static final Target BOTON_LOGIN= Target
            .the("Boton login")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView"));


    private LoginScreen() {
    }
}

