package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.xpath;

public class HomeScreen {
    public static final Target ECHO_BOX = Target.the("Echo box")
            .located(xpath("//android.view.ViewGroup[@content-desc='Echo Box']"));

    public static final Target LOGIN_SCREEN = Target.the("Login screen")
            .located(xpath("//android.view.ViewGroup[@content-desc='Login Screen']"));

    public static final Target LIST_DEMO = Target.the("List demo")
            .located(xpath("//android.view.ViewGroup[@content-desc='List Demo']"));

    public static final Target PHOTO_DEMO = Target.the("Photo demo")
            .located(xpath("//android.view.ViewGroup[@content-desc='Photo Demo']"));
}