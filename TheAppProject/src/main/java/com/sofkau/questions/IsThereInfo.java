package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ListScreen.MESSAGE;

public class IsThereInfo implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MESSAGE.resolveFor(actor).getText();
    }

    public static IsThereInfo isThereInfo() {
        return new IsThereInfo();
    }
}