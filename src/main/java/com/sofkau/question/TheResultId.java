package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.ListDemo.MENSAJEID;

public class TheResultId implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJEID.resolveFor(actor).getText();

    }
    public static TheResultId theResultId() {
        return new TheResultId();
    }
}

