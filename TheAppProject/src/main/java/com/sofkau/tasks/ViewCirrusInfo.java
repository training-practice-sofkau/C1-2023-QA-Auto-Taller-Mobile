package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.ListScreen.CIRRUS;
import static com.sofkau.ui.ListScreen.MORE_BTTN;

public class ViewCirrusInfo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CIRRUS),
                Click.on(MORE_BTTN)
        );
    }

    public static ViewCirrusInfo viewCirrusInfo() {
        return new ViewCirrusInfo();
    }
}