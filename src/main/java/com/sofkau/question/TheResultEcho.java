package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.EchoBox.RESULT_ECHO;


public class TheResultEcho implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return RESULT_ECHO.resolveFor(actor).getText();

    }
    public static TheResultEcho theResultEcho() {
        return new TheResultEcho();
    }
}
