package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.test.ui.PaginaEchobox.*;

public class EchoboxTask implements Task {
    private String mensaje;

    public EchoboxTask conElMensaje(String mensaje){
        this.mensaje=mensaje;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ECHO_BOX),
                Enter.theValue(mensaje).into(CAMPO_MENSAJE),
                Click.on(BTN_SAVE)
        );
    }
    public static EchoboxTask echoboxTask(){return new EchoboxTask();}
}
