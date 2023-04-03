package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;

import static io.appium.java_client.AppiumBy.*;

public class MensajeTheApp {

    public static final Target ECHO_BOX = Target
            .the("Echo box")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Echo Box\"]/android.widget.TextView[1]"));
    public static final Target INPUT_MSJ = Target
            .the("input msj")
            .located(accessibilityId("messageInput"));
    public static final Target SAVE_MSJ = Target
            .the("input msj")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[1]"));
    public static final Target PAGE_MSJ = Target
            .the("input msj")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"messageSaveBtn\"]/android.widget.TextView"));
    public static final Target RETORNA_MSJ = Target
            .the("input msj")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"messageSaveBtn\"]/android.widget.TextView"));

    private MensajeTheApp() {
    }
}

