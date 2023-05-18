package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.PhotoDemo.INFOPHOTO;

public class TheResultPhoto implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return INFOPHOTO.resolveFor(actor).getText();

    }

    public static com.sofkau.question.TheResultPhoto theResultPhoto() {
        return new com.sofkau.question.TheResultPhoto();
    }
}
