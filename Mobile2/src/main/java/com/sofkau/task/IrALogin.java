package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomeApp.LOGIN_OPTION;

public class IrALogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((LOGIN_OPTION))
        );
    }
    public static IrALogin irALogin(){
        return new IrALogin();
    }
}
