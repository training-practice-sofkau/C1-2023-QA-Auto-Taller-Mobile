package com.test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {
    public static final Target OPCION_LOGIN = Target.the("Opcion de login")
            .located(By.xpath("//android.view.ViewGroup[@content-desc='Login Screen']"));

    public static final Target OPCION_CLIPBOARD = Target.the("Opcion de portapapeles")
            .located(By.xpath("//android.view.ViewGroup[@content-desc='Clipboard Demo']"));

    public static final Target OPCION_PICKERDATES = Target.the("Opcion de portapapeles")
            .located(By.xpath("//android.view.ViewGroup[@content-desc='Picker Demo']"));

}
