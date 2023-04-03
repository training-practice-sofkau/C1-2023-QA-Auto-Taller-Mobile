package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PickerDemoOverview.LEARN_MORE;

public class FinalizarIngresarPicker implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LEARN_MORE)
        );
    }
    public static FinalizarIngresarPicker finalizarIngresarPicker() {return new FinalizarIngresarPicker();}
}
