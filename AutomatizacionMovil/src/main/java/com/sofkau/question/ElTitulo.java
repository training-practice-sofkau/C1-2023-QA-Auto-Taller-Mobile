package com.sofkau.question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PickerDemoOverview.TITULO;

public class ElTitulo implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TITULO.resolveFor(actor).getText();
    }
    public static ElTitulo elTitulo() {
        return new ElTitulo();
    }
}
