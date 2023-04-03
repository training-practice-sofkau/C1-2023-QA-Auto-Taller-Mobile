package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.Photo.BTN_PHOTO;

public class PhotoTaskOpen implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_PHOTO)
    );
    }
    public static PhotoTaskOpen photoTaskOpen() {return new PhotoTaskOpen();}
}
