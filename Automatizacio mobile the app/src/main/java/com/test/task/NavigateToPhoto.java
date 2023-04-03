package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.PaginaInicial.OPCION_PHOTO;

public class NavigateToPhoto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_PHOTO)
        );
    }
    public static NavigateToPhoto navigateToPhoto(){
        return new NavigateToPhoto();
    }
}
