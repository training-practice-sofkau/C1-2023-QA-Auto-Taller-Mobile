package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static io.appium.java_client.AppiumBy.xpath;

public class Photo {
    public static final Target BTN_PHOTO = Target
            .the("opcion photo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Photo Demo\"]/android.widget.TextView[2]"));
    public static final Target BTN_CONFIRMACION_PHOTO = Target
            .the("opcion confirmacion")
            .located(id("android:id/alertTitle"));
    public static final Target BTN_CLICK4 = Target
            .the("opcion 4")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView"));
    public static final Target BTN_CLICK2 = Target
            .the("opcion 2")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView"));
    public static final Target BTN_CLICK6 = Target
            .the("opcion 6")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.ImageView"));

}
