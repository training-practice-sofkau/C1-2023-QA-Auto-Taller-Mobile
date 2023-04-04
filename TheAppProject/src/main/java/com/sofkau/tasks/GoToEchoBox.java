package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomeScreen.ECHO_BOX;

public class GoToEchoBox implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ECHO_BOX)
        );
    }

    public static GoToEchoBox goToEchoBox() {
        return new GoToEchoBox();
    }
}