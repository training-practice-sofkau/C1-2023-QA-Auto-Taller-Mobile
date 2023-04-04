package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomeScreen.LOGIN_SCREEN;

public class GoToLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_SCREEN)
        );
    }

    public static GoToLogin goToLogin() {
        return new GoToLogin();
    }
}