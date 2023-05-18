package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.LoginScreen.LOGGED;

public class TheResultLogin implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LOGGED.resolveFor(actor).getText();

    }

    public static com.sofkau.question.TheResultLogin theResultLogin() {
        return new com.sofkau.question.TheResultLogin();
    }
}

