package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static com.test.ui.PaginaFotos.MENSAJE_FOTO;

public class MensajeDeConsultaFoto {
    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_FOTO);
    }

    private MensajeDeConsultaFoto() {
    }
}
