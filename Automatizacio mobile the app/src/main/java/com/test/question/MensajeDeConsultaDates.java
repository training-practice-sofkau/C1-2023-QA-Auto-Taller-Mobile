package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static com.test.ui.PaginaDates.MENSAJE_DATES;

public class MensajeDeConsultaDates {
    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_DATES);
    }

    private MensajeDeConsultaDates() {
    }
}
