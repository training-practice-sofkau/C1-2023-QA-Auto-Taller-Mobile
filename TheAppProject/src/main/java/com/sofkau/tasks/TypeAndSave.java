package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.EchoBoxScreen.SAVE_BTTN;
import static com.sofkau.ui.EchoBoxScreen.TEXT_BOX;

public class TypeAndSave implements Task {
    private final String text;

    public TypeAndSave(String text) {
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(text).into(TEXT_BOX),
                Click.on(SAVE_BTTN)
        );
    }

    public static TypeAndSave typeAndSave(String text) {
        return new TypeAndSave(text);
    }
}