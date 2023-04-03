package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.LearnMore.LEARN_MORE_MESSAGE;

public class PickerDemoResult implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LEARN_MORE_MESSAGE.resolveFor(actor).getText();
    }

    public static PickerDemoResult pickerDemoResult(){
        return new PickerDemoResult();
    }
}
