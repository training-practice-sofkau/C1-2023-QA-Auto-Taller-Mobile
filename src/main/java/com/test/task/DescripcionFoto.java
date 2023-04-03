package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.PhotoDemo.*;

public class DescripcionFoto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PHOTODEMO),
                Click.on(PHOTO1),
                Click.on(BTN_OK),
                Click.on(PHOTO4),
                Click.on(BTN_OK)

        );

    }
    public static DescripcionFoto descripcionFoto() {return new DescripcionFoto();
    }

}
