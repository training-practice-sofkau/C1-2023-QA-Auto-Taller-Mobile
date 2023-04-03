package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
public class ValidarMensajeFoto {
    public static final Target MENSAJE_FOTO = Target
            .the("Mensaje foto")
            .located(id("android:id/message"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_FOTO);
    }

    private ValidarMensajeFoto() {

    }
}
