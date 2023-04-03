package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.EchoBoxScreen.ECHO_BOX_SAVED_MESSAGE;
import static com.sofkau.ui.EchoBoxScreen.MESSAGE;


public class EchoBoxResult implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return ECHO_BOX_SAVED_MESSAGE.resolveFor(actor).getText();
    }

    public static EchoBoxResult echoBoxResult(){
        return new EchoBoxResult();
    }
}
