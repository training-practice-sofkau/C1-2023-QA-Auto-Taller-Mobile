package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class HomeApp {


    public static final Target LOGIN_OPTION = Target
            .the("Login Option")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]"));

    public static final Target CLIPBOARD_OPTION = Target
            .the("Clipboard option")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Clipboard Demo\"]"));
    public static final Target LIST_DEMO_OPTION = Target
            .the("Clipboard option")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"List Demo\"]"));
    public static final Target PHOTO_DEMO_OPTION = Target
            .the("Clipboard option")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Photo Demo\"]"));

}
