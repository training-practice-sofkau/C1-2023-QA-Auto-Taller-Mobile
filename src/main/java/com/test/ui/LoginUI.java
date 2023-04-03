package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.xpath;

public class LoginUI {

    public static final Target FUNCIONALIDAD_LOGIN_SCREEN = Target
            .the("Login Screen")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

    public static final Target CAMPO_USERNAME = Target
            .the("Username")
            .located(xpath("//android.widget.EditText[@content-desc=\"username\"]"));
    public static final Target CAMPO_PASSWORD = Target
            .the("Password")
            .located(xpath("//android.widget.EditText[@content-desc=\"password\"]"));
    public static final Target BOTON_LOGIN = Target
            .the("Password")
            .located(xpath("//android.widget.EditText[@content-desc=\"password\"]"));
    public static final Target MENSAJE_ASERCION = Target
            .the("Mensaje de la asercion")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[1]"));
    public static final Target MENSAJE_ASERCION_FALLIDA = Target
            .the("Mensaje de la asercion fallida")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"));
    private LoginUI() {
    }
}
