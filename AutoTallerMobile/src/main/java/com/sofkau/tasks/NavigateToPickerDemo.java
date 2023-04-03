package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomePage.PICKER_DEMO_FEATURE;

public class NavigateToPickerDemo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PICKER_DEMO_FEATURE)
        );
    }

    public static NavigateToPickerDemo navigateToPickerDemo(){
        return new NavigateToPickerDemo();
    }
}
