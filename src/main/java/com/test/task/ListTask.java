package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.List.BTN_FOG;
import static com.test.ui.List.BTN_LEARN;

public class ListTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_FOG),
            Click.on(BTN_LEARN)

    );
    }
    public static ListTask listTask
            (){return new ListTask();}
}

