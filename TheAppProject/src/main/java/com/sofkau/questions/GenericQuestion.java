package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.GenericUI.LOCATOR;

public class GenericQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LOCATOR.resolveFor(actor).getText();
    }

    public static GenericQuestion genericQuestion() {
        return new GenericQuestion();
    }
}