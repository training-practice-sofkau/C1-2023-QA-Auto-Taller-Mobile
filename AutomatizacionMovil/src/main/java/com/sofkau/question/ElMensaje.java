package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.PickerDemoOverview.MENSAJE;
public class ElMensaje implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE.resolveFor(actor).getText();
    }
    public static ElMensaje elMensaje() {
        return new ElMensaje();
    }
}
