package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PhotoScreen.PHOTO_INFO;

public class IsThereDescription implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return PHOTO_INFO.resolveFor(actor).getText();
    }

    public static IsThereDescription isThereDescription() {
        return new IsThereDescription();
    }
}