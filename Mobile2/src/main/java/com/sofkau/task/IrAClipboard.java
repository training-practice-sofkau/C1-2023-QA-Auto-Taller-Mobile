package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomeApp.CLIPBOARD_OPTION;
import static com.sofkau.ui.HomeApp.LOGIN_OPTION;

public class IrAClipboard implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((CLIPBOARD_OPTION))
        );
    }
    public static IrAClipboard irAClipboard(){
        return new IrAClipboard();
    }
}
