package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class HomePage extends PageObject {

    public static final Target LOGIN_SCREEN_FEATURE = Target.the("login feature")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
    public static final Target ECHO_BOX_FEATURE = Target.the("echo box feature")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Echo Box\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

    public static final Target PICKER_DEMO_FEATURE = Target.the("picker demo feature")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Picker Demo\"]/android.widget.TextView[1]"));

    public static final Target LIST_DEMO_FEATURE = Target.the("list demo feature")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"List Demo\"]/android.view.ViewGroup/android.widget.TextView[1]"));

}
