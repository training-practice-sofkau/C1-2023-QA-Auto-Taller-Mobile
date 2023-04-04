package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class LoginScreen {
    public static final Target USERNAME = Target.the("Input username box")
            .located(xpath("//android.widget.EditText[@content-desc='username']"));

    public static final Target PASSWORD = Target.the("Input password box")
            .located(xpath("//android.widget.EditText[@content-desc='password']"));

    public static final Target LOGIN_BTTN = Target.the("Input password box")
            .located(xpath("//android.view.ViewGroup[@content-desc='loginBtn']"));
}