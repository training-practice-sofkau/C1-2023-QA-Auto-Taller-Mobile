package sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.*;

public class InicioSesion {

    public static final Target BOTON_LOGIN = Target
            .the("IR LOGIN")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));


    public static final Target CAMPO_USER = Target
            .the("USER")
            .located(accessibilityId("username"));


    public static final Target CAMPO_PASSWORD = Target
            .the("PASSWORD")
            .located(accessibilityId("password"));


    public static final Target BOTON_OK = Target
            .the("PASSWORD")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView"));


}
