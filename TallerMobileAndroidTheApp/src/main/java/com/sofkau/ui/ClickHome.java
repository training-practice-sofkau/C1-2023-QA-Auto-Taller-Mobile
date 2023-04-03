package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ClickHome {

    public static final Target BTN_MAYOR_QUE = Target
            .the("Boton mayor que >")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

}
