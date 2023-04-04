package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.EchoBoxScreen.VIEW_TEXT;


public class IsSameText implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return VIEW_TEXT.resolveFor(actor).getText();
    }

    public static IsSameText isSameText() {
        return new IsSameText();
    }
}