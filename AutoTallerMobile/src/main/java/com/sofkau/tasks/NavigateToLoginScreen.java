package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomePage.LOGIN_SCREEN_FEATURE;

public class NavigateToLoginScreen implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_SCREEN_FEATURE)
        );
    }

    public static NavigateToLoginScreen navigateToLoginScreen(){
        return new NavigateToLoginScreen();
    }
}
