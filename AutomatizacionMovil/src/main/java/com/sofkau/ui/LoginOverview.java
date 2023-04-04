package com.sofkau.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginOverview {
    public static final Target LOGIN = Target.the("Ingresar al login")
            .located(AppiumBy.accessibilityId("Login Screen"));
    public static final Target USERNAME = Target.the("username")
            .located(AppiumBy.accessibilityId("username"));
    public static final Target CONTRASENNA = Target.the("password")
            .located(AppiumBy.accessibilityId("password"));
    public static final Target LOGIN_FINAL = Target.the("boton login")
            .located(AppiumBy.accessibilityId("loginBtn"));
    public static final Target SECRET_AREA = Target.the(" mensaje secret area")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[1]"));
    public static final Target LOGGED=Target.the("mensaje Logged")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[2]"));
}