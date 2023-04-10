package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.test.ui.MensajeTheApp.ECHO_BOX;

public class MensajeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ECHO_BOX)
        );
    }

    public static MensajeTask mensajeTask() {return new MensajeTask();}
}
