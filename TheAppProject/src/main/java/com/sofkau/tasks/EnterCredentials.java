package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.LoginScreen.PASSWORD;
import static com.sofkau.ui.LoginScreen.USERNAME;
import static com.sofkau.utils.Constants.PASS;
import static com.sofkau.utils.Constants.USER;

public class EnterCredentials implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USER).into(USERNAME),
                Enter.theValue(PASS).into(PASSWORD)
        );
    }

    public static EnterCredentials enterCredentials() {
        return new EnterCredentials();
    }
}