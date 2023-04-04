package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.By.id;

public class ListScreen {
    public static final Target CIRRUS = Target.the("Cirrus cloud")
            .located(xpath("//android.view.ViewGroup[@content-desc='Cirrus']"));

    public static final Target MORE_BTTN = Target.the("Learn more about Cirrus button")
            .located(id("android:id/button3"));

    public static final Target MESSAGE = Target.the("Message about Cirrus")
            .located(id("android:id/message"));
}