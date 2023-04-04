package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.SecretAreaScreen.TITLE;

public class LoggedIn implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TITLE.resolveFor(actor).getText();
    }

    public static LoggedIn loggedIn() {
        return new LoggedIn();
    }
}