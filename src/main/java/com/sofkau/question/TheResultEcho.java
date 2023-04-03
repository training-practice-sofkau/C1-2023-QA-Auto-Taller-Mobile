package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.EchoBox.RESULT_ECHO;


public class TheResult implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return RESULT_ECHO.resolveFor(actor).getText();
    }
    public static TheResult theResult() {
        return new TheResult();
    }
}
