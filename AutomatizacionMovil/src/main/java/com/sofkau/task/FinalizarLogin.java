package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.LoginOverview.LOGIN_FINAL;

public class FinalizarLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_FINAL)
        );
    }
    public static FinalizarLogin finalizarLogin(){
        return new FinalizarLogin();
    }
}
