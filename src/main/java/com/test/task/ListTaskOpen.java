package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.List.BTN_LIST;

public class ListTaskOpen implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LIST)
        );
    }
    public static ListTaskOpen listTaskOpen
            (){return new ListTaskOpen();}
}

