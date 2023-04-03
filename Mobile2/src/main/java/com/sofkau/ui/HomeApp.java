package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class HomeApp {


    public static final Target LOGIN_OPTION = Target
            .the("Login Option")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]"));

    public static final Target CLIPBOARD_OPTION = Target
            .the("Clipboard option")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Clipboard Demo\"]"));
}
