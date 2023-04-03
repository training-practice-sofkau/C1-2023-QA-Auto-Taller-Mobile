package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.test.ui.PhotoDemoUI.BOTON_PHOTO_DEMO;

public class NavegarPhotoDemo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BOTON_PHOTO_DEMO)

        );
    }
    public static NavegarPhotoDemo navegarPhotoDemo() {return new NavegarPhotoDemo();}
}

