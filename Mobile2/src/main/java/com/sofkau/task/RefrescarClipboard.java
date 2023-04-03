package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.ClipBoardView.BUTTON_REFRESH;
import static com.sofkau.ui.HomeApp.LOGIN_OPTION;

public class RefrescarClipboard implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_REFRESH)
        );
    }
    public static RefrescarClipboard refrescarClipboard(){
        return new RefrescarClipboard();
    }
}
