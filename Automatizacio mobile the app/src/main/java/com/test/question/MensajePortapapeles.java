package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static com.test.ui.PaginaPortapapeles.MENSAJE_PORTAPAPELES;

public class MensajePortapapeles {
    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_PORTAPAPELES);
    }

    private MensajePortapapeles() {
    }
}
