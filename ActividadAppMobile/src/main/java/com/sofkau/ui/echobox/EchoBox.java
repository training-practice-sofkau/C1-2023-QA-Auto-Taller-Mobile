package com.sofkau.ui.echobox;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static io.appium.java_client.AppiumBy.id;

public class EchoBox {

    public static final Target CAMPO_TEXTO_ECHOBOX = Target.the("Campo de texto echo box")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"messageInput\"]"));

    public static final Target BOTON_SAVE_ECHOBOX= Target.the("Boton de guardar texto de exhobox")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"messageSaveBtn\"]/android.widget.TextView"));
}
