package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.xpath;

public class LoginScreen {
    public static final Target LOGIN = Target
            .the("LoginScreen")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]"));
    public static final Target USERNAME = Target
            .the("usuario")
            .located(xpath("//android.widget.EditText[@content-desc=\"username\"]"));
    public static final Target PASSWORD = Target
            .the("contraseña")
            .located(xpath("//android.widget.EditText[@content-desc=\"password\"]"));
    public static final Target BTN_LOGIN = Target
            .the("boton login")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView"));
    public static final Target LOGGED = Target
            .the("logueado")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[2]"));

    private LoginScreen() {
    }
}
