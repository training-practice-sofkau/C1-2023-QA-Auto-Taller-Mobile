package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.LoginOverview.LOGGED;

public class Logged implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LOGGED.resolveFor(actor).getText();
    }
    public static Logged logged() {
        return new Logged();
    }
}
