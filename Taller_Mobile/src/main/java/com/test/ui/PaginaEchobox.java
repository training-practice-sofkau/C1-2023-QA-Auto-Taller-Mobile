package com.test.ui;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.xpath;
public class PaginaEchobox {
    public static final Target BTN_ECHO_BOX = Target
            .the("Pantalla de echo box")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Echo Box\"]/android.view.ViewGroup/android" +
                    ".view.ViewGroup/android.widget.TextView"));

    public static final Target CAMPO_MENSAJE = Target
            .the("Campo escribir mensaje")
            .located(accessibilityId("messageInput"));

    public static final Target BTN_SAVE = Target
            .the("Boton guardar mensaje")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"messageSaveBtn\"]/android.widget.TextView"));
}
