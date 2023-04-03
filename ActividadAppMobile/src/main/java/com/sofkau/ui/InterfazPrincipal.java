package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static io.appium.java_client.AppiumBy.id;

public class InterfazPrincipal {

    public static final Target ECHO_BOX = Target.the("Funcionalidad echo box")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"Echo Box\"]/android.widget.TextView[1]"));

    public static final Target LOGIN=Target.the("Funcionalidad login")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"Login Screen\"]/android.widget.TextView[1]"));

    public static final Target WEBVIEW=Target.the("Funcionalidad webview")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"Webview Demo\"]/android.widget.TextView[1]"));

    public static final Target LIST=Target.the("Funcionalidad listdemo")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"List Demo\"]"));

}
