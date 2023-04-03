package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SendKeysIntoBy;

import static com.test.ui.EchoBox.*;
import static com.test.ui.PhotoDemo.*;

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

