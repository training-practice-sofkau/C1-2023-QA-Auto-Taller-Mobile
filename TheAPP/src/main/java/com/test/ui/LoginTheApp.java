package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;


import static io.appium.java_client.AppiumBy.*;

public class LoginTheApp {

    public static final Target LOGIN_SCREEN = Target
            .the("Login")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

    public static final Target INPUT_USER = Target
            .the("User")
            .located(accessibilityId("username"));

    public static final Target INPUT_PASS = Target
            .the("Pass")
            .located(accessibilityId("password"));

    public static final Target BUTTON_LOGOUT = Target
            .the("Logout")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView"));
    public static final Target MSJ_CONFIRMAR_LOGIN = Target
            .the("Logout")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[1]"));


    private LoginTheApp() {
    }
}

