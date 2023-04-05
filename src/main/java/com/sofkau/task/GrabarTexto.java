package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.EchoBox.*;

public class GrabarTexto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ECHOBOX),
                Enter.theValue("Buenas tardes team QA").into(ESCRIBIR_TEXTO),
                Click.on(BTN_SAVE)
        );
    }

    public static GrabarTexto grabarTexto() {return new GrabarTexto();
    }
}

