package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomeApp.LOGIN_OPTION;
import static com.sofkau.ui.HomeApp.PHOTO_DEMO_OPTION;

public class IrAPhotoDemo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((PHOTO_DEMO_OPTION))
        );
    }
    public static IrAPhotoDemo irAPhotoDemo(){
        return new IrAPhotoDemo();
    }
}
