package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.PaginaInicial.OPCION_PICKERDATES;

public class NavigateToDates implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_PICKERDATES)
        );
    }
    public static NavigateToDates navigateToDates(){
        return new NavigateToDates();
    }
}
