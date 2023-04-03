package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class PhotoDemo {
    public static final Target PHOTODEMO = Target
            .the("PhotoDemo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Photo Demo\"]"));
    public static final Target PHOTO1 = Target
            .the("foto 1")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
    public static final Target INFOPHOTO = Target
            .the("informacion foto")
            .located(id("android:id/message"));
    public static final Target PHOTO4 = Target
            .the("foto 4")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView"));

    private PhotoDemo() {
    }
}
