package com.sofkau.task;

import io.cucumber.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.ClipBoardView.*;
import static com.sofkau.ui.LoginView.*;

public class SetearNuevoMensaje implements Task {
    private String message;
    public SetearNuevoMensaje conElMensaje(String message){
        this.message=message;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(message).into(NEW_INPUT),
                Click.on(BUTTON_SET_CLIPBOARD)
        );
    }
    public static SetearNuevoMensaje setearNuevoMensaje(){ return new SetearNuevoMensaje();
    }
}
