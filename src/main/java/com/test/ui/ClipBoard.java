package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static io.appium.java_client.AppiumBy.xpath;

public class ClipBoard {

    public static final Target BTN_CLICKBORAD = Target
            .the("opcion clickboardemo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Clipboard Demo\"]"));
    public static final Target BTN_TYPE = Target
            .the("ingresar texto")
            .located(xpath("//android.widget.EditText[@content-desc=\"messageInput\"]"));
    public static final Target BTN_SET = Target
            .the("enviar")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"setClipboardText\"]/android.widget.TextView"));

    public static final Target BTN_REFRESH = Target
            .the("refrescar")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"refreshClipboardText\"]/android.widget.TextView"));
    public static final Target BTN_VALIDATION1 = Target
            .the("opcion validar 1")
            .located(id("el dia esta muy soleado"));


}
