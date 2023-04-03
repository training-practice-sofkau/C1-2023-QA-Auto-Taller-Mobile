package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static com.test.ui.PaginaSesionIniciada.RESULT;
import static io.appium.java_client.AppiumBy.id;


public class MensajeLoginExitoso {
    public static Question<String> isEqualTo(){
        return TheTarget.textOf(RESULT);
    }

    private MensajeLoginExitoso() {
    }
}
