package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.LoginOverview.SECRET_AREA;


public class SecretArea  implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return SECRET_AREA.resolveFor(actor).getText();
    }
    public static SecretArea secretArea() {
        return new SecretArea();
    }
}
