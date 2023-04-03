package com.test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin {

    public static final Target CAMPO_USER = Target.the("Campo de usuario")
            .located(AppiumBy.accessibilityId("username"));

    public static final Target CAMPO_PASSWD = Target.the("Campo de contrasenna")
            .located(AppiumBy.accessibilityId("password"));

    public static final Target BTN_LOGIN = Target.the("Boton iniciar sesion")
            .located(By.xpath("//android.view.ViewGroup[@content-desc='loginBtn']"));

}
