package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.By.id;

public class PhotoScreen {
    public static final Target FIRST_PHOTO = Target.the("First photo")
            .located(xpath("(//android.widget.ImageView[@package='io.cloudgrey.the_app'])[1]"));

    public static final Target PHOTO_INFO = Target.the("Photo info")
            .located(id("android:id/message"));
}