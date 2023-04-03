package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static io.appium.java_client.AppiumBy.xpath;

public class PhotoDemoUI {
    public static final Target BOTON_PHOTO_DEMO = Target
            .the("PhotoDemo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Photo Demo\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
    private PhotoDemoUI() {
    }
}
