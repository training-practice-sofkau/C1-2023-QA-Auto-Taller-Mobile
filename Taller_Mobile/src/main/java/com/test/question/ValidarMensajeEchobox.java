package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class ValidarMensajeEchobox {
    public static final Target MENSAJE_ECHO_BOX = Target
            .the("Mensaje obtenido")
            .located(accessibilityId("Hola mundo"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_ECHO_BOX);
    }

    private ValidarMensajeEchobox(){

    }
}
