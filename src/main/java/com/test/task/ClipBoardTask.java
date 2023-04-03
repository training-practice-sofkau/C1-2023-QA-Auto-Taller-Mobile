package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.test.ui.ClipBoard.*;

public class ClipBoardTask implements Task {
    private String mensaje;

    public ClipBoardTask conElMensaje(String mensaje){
        this.mensaje=mensaje;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_TYPE),
                Enter.theValue(mensaje).into(BTN_TYPE),
                Click.on(BTN_SET),
                Click.on(BTN_REFRESH)

        );

    }

    public static ClipBoardTask clipBoardTask() {return new ClipBoardTask();}
}
