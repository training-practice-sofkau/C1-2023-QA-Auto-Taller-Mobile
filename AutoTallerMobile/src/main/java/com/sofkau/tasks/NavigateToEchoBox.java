package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomePage.ECHO_BOX_FEATURE;

public class NavigateToEchoBox implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ECHO_BOX_FEATURE)
        );
    }

    public static NavigateToEchoBox navigateToEchoBox(){
        return new NavigateToEchoBox();
    }
}
