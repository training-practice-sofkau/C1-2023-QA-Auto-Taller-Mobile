package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class SecretAreaScreen {
    public static final Target TITLE = Target.the("Secret area title")
            .located(xpath("//android.widget.TextView[@text='Secret Area']"));
}