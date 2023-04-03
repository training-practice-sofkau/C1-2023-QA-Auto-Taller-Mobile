package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.Photo.BTN_CLICK4;

public class PhotoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_CLICK4)
    );
    }
    public static PhotoTask photoTask
            (){return new PhotoTask();}
}
