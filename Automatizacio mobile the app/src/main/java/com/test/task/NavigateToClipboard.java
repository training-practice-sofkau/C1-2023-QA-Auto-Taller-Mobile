package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.PaginaInicial.OPCION_CLIPBOARD;

public class NavigateToClipboard implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_CLIPBOARD)
        );
    }
    public static NavigateToClipboard navigateToClipboard(){
        return new NavigateToClipboard();
    }
}
