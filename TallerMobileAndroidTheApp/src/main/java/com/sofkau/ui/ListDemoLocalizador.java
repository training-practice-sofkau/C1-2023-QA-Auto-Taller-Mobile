package com.sofkau.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class ListDemoLocalizador {

    public static final Target BTN_MAYOR_QUE_LIST_DEMO = Target
            .the("Boton mayor que lista demo >")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"List Demo\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

    public static final Target BTN_MAYOR_QUE_CUMULONIMBUS= Target
            .the("Boton mayor que Comulonnimbus")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Cumulonimbus\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));


    private ListDemoLocalizador() {
    }
}
