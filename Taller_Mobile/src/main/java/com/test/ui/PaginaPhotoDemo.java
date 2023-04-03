package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.xpath;

public class PaginaPhotoDemo {
    public static final Target BTN_PHOTO_DEMO = Target
            .the("Pantalla de photo demo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Photo Demo\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
    public static final Target PHOTO_UNO = Target
            .the("Foto uno")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                    "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android." +
                    "widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view." +
                    "ViewGroup[1]/android.widget.ImageView"));
}
