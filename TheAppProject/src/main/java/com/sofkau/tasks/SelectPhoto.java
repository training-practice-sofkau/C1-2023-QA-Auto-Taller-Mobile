package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PhotoScreen.FIRST_PHOTO;

public class SelectPhoto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIRST_PHOTO)
        );
    }

    public static SelectPhoto selectPhoto() {
        return new SelectPhoto();
    }
}