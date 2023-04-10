package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.test.ui.MensajeTheApp.INPUT_MSJ;


public class EscribirMensajeTask implements Task {
    private String mensaje;
    public EscribirMensajeTask conElMsj(String mensaje){
        this.mensaje=mensaje;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(INPUT_MSJ),
                Enter.theValue(mensaje).into(INPUT_MSJ)
        );
    }

    public static EscribirMensajeTask escribirMensajeTask() {return new EscribirMensajeTask();}
}
