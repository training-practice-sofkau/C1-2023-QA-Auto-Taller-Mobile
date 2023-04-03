package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.PaginaPhotoDemo.BTN_PHOTO_DEMO;
import static com.test.ui.PaginaPhotoDemo.PHOTO_UNO;

public class PhotoDemoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PHOTO_DEMO),
                Click.on(PHOTO_UNO)
        );
    }

    public static PhotoDemoTask photoDemoTask(){
        return new PhotoDemoTask();
    }
}
