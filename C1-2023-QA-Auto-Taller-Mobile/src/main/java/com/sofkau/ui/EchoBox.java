package sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.*;

public class EchoBox {


    public static final Target BOTON_IR_ECHO= Target
            .the("IR EchoBox")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Echo Box\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\n"));



    public static final Target CAMPO_MENSAJE = Target
            .the("MENSAJE")
            .located(accessibilityId("messageInput"));



    public static final Target BOTON_SAVE= Target
            .the("BOTON GUARDAR")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"messageSaveBtn\"]/android.widget.TextView\n"));




}
