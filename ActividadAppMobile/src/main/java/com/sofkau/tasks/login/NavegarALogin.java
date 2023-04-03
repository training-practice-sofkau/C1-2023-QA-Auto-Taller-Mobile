package com.sofkau.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.InterfazPrincipal.LOGIN;

public class NavegarALogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN)
        );
    }

    public static NavegarALogin navegarALogin(){
        return new NavegarALogin();
    }
}
