package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;

public class ValidarMensajeFecha {
    public static final Target MENSAJE_FECHA = Target
            .the("Mensaje fecha")
            .located(id("android:id/message"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_FECHA);
    }

    private ValidarMensajeFecha() {

    }
}
