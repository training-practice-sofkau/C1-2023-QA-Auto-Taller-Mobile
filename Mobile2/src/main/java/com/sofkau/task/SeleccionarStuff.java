package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.ClipBoardView.BUTTON_SET_CLIPBOARD;
import static com.sofkau.ui.ClipBoardView.NEW_INPUT;
import static com.sofkau.ui.ListDemoView.STUFF_OPTION;

public class SeleccionarStuff implements Task {
    private String stuff;
    public SeleccionarStuff elStuff(String stuff){
        this.stuff=stuff;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(String.format(STUFF_OPTION,stuff))
        );
    }
    public static SeleccionarStuff seleccionarStuff(){ return new SeleccionarStuff();
    }
}
