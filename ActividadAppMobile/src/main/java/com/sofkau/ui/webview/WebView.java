package com.sofkau.ui.webview;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebView {

    public static final Target BOTON_GO=Target.the("")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"navigateBtn\"]/android.widget.TextView"));

    public static final Target BOTON_CLEAR=Target.the("")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"clearBtn\"]/android.widget.TextView"));

    public static final Target CAMPO_URL=Target.the("")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"urlInput\"]"));
}
