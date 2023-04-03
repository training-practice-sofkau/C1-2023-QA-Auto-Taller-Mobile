package com.test.question;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;

public class PhotoDemo {
    public static Target photo(int index) {
        String locator = String.format("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[%d]/android.widget.ImageView", index);
        return Target.the("Photo " + index).locatedBy(locator);
    }
}

