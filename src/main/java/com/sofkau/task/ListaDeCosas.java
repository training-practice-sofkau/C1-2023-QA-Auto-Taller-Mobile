package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.ListDemo.*;

public class ListaDeCosas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LISTDEMO),
                Click.on(CIRRUS),
                Click.on(LEARN_MORE),
                Click.on(BTN_OK),
                Click.on(FOG),
                Click.on(BTN_OK)
        );
    }
    public static ListaDeCosas listaDeCosas() {return new ListaDeCosas();
    }
}
