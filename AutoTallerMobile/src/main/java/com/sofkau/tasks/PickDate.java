package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PickerDemoScreen.*;

public class PickDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MONTH_PICKER),
                Click.on(PICK_MONTH),
                Click.on(DAY_PICKER),
                Click.on(PICK_DAY),
                Click.on(LEARN_MORE_BUTTON)

        );
    }

    public static PickDate pickDate(){
        return new PickDate();
    }
}
