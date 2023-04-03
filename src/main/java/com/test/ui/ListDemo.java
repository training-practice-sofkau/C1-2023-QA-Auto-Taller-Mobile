package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class ListDemo {
    public static final Target ListDemo = Target
            .the("ListDemo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"List Demo\"]"));
    public static final Target CIRRUS = Target
            .the("cosa1")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Cirrus\"]/android.widget.TextView"));
    public static final Target FOG = Target
            .the("cosa2")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Fog\"]/android.widget.TextView"));
    public static final Target MENSAJEID = Target
            .the("mensaje")
            .located(id("android:id/message"));
    public static final Target BTN_OK = Target
            .the("boton ok")
            .located(id("android:id/button1"));
    public static final Target LEARN_MORE = Target
            .the("leer mas")
            .located(id("android:id/button3"));
    private ListDemo() {
    }
}
