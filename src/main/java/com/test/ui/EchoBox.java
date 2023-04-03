package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class EchoBox {

    public static final Target EchoBox = Target
            .the("EchoBox")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Echo Box\"]"));
    public static final Target EscribirText = Target
            .the("escribirTexto")
            .located(xpath("//android.widget.EditText[@content-desc=\"messageInput\"]"));
    public static final Target Save = Target
            .the("3")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"messageSaveBtn\"]/android.widget.TextView"));
    public static final Target ResultEcho = Target
            .the("4")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[1]"));

    private EchoBox() {
    }
}
