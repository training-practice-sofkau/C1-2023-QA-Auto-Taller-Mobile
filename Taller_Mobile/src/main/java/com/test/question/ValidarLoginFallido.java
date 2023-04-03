package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import static io.appium.java_client.AppiumBy.id;

public class ValidarLoginFallido {
    public static final Target MENSAJE_FALLIDO = Target
            .the("Mensaje de login exitoso")
            .located(id("android:id/alertTitle"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_FALLIDO);
    }

    private ValidarLoginFallido(){

    }
}
