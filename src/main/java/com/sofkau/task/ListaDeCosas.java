package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.ListDemo.*;

public class ListaDeCosas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LISTDEMO),
                Click.on(CIRRUS),
                Click.on(LEARN_MORE),
                Click.on(BTN_OK),
                Click.on(FOG)
        );
    }
    public static ListaDeCosas listaDeCosas() {return new ListaDeCosas();
    }
}
