package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static com.test.ui.PaginaSesionIniciada.RESULT_FAIL;

public class MensajeLoginFallido {
    public static Question<String> isEqualTo(){
        return TheTarget.textOf(RESULT_FAIL);
    }

    private MensajeLoginFallido() {
    }
}
