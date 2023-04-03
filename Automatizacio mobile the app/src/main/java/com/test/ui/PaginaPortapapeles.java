package com.test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPortapapeles {

    public static final Target CAMPO_CLIPBOARD = Target.the("Campo de entrada al portapapeles")
            .located(AppiumBy.accessibilityId("messageInput"));

    public static final Target BTN_GUARDAR = Target.the("Boton guardar")
            .located(By.xpath("//android.view.ViewGroup[@content-desc='setClipboardText']"));

    public static final Target BTN_REFRESH = Target.the("Boton refrescar")
            .located(By.xpath("//android.view.ViewGroup[@content-desc='refreshClipboardText']"));

    public static final Target MENSAJE_PORTAPAPELES = Target.the("Boton refrescar")
            .located(By.xpath("(//android.widget.TextView)[2]"));
}
