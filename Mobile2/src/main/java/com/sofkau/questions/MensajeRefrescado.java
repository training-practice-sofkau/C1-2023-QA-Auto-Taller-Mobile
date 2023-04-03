package com.sofkau.questions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeRefrescado {

    public static String REFRESH_TEXT = "//android.widget.TextView[@content-desc=\"%s\"]";
    public static String INPUT_MESSAGE;
    public static Question<String> isEqualTo(){
        return TheTarget.textOf(Target.the("Nuevo clipboard message")
                .located(By.xpath(String.format(REFRESH_TEXT,INPUT_MESSAGE))));
    }
    private MensajeRefrescado() {
    }
}
