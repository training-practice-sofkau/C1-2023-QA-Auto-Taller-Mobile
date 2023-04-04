package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PickerDemoOverview.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FinalizarIngresarPicker implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LEARN_MORE),
                WaitUntil.the(LEARN_MORE,isNotPresent()),
                WaitUntil.the(TITULO,isPresent()),
                WaitUntil.the(MENSAJE,isPresent()),
                WaitUntil.the(TITULO,isCurrentlyVisible()),
                WaitUntil.the(MENSAJE,isCurrentlyVisible())
        );
    }
    public static FinalizarIngresarPicker finalizarIngresarPicker() {return new FinalizarIngresarPicker();}
}
