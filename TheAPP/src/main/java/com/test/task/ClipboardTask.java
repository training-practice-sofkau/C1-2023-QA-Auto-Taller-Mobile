package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.SetMensajeTheApp.CLIPBOARD;

public class ClipboardTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CLIPBOARD)

        );
    }

    public static ClipboardTask clipboardTask(){return new ClipboardTask();}
}
