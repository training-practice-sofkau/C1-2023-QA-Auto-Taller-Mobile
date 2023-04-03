package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.PaginaInicial.OPCION_LOGIN;

public class NavigateToLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_LOGIN)
        );
    }
    public static NavigateToLogin navigateToLogin(){
        return new NavigateToLogin();
    }
}
