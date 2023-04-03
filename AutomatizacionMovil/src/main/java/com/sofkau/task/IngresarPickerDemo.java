package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.CalculatorOverview.*;

public class IngresarPickerDemo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on()
        );
    }
    public static IngresarPickerDemo ingresarPickerDemo() {return new IngresarPickerDemo();}
}
