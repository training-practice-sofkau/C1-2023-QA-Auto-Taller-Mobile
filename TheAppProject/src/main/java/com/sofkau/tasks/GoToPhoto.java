package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomeScreen.PHOTO_DEMO;

public class GoToPhoto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PHOTO_DEMO)
        );
    }

    public static GoToPhoto goToPhoto() {
        return new GoToPhoto();
    }
}