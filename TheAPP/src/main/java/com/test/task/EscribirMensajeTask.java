package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.test.ui.TheAppOverview.INPUT_MSJ;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EscribirMensajeTask implements Task {
    private String mensaje;
    public EscribirMensajeTask conElMsj(String mensaje){
        this.mensaje=mensaje;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(INPUT_MSJ, isPresent()),
                WaitUntil.the(INPUT_MSJ, isCurrentlyVisible()),
                WaitUntil.the(INPUT_MSJ, isCurrentlyEnabled()),
                WaitUntil.the(INPUT_MSJ,isClickable()),
                Click.on(INPUT_MSJ),
                Enter.theValue(mensaje).into(INPUT_MSJ)
        );
    }

    public static EscribirMensajeTask escribirMensajeTask() {return new EscribirMensajeTask();}
}
