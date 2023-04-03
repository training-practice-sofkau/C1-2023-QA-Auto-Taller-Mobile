package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.CalculatorOverview.*;

public class SumaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_1),
                Click.on(BTN_0),
                Click.on(BTN_0),
                Click.on(BTN_0),
                Click.on(BTN_0),
                Click.on(BTN_0),
                Click.on(PLUS),
                Click.on(BTN_1),
                Click.on(BTN_2),
                Click.on(BTN_0),
                Click.on(BTN_PUNTO),
                Click.on(BTN_5),
                Click.on(BTN_6),
                Click.on(BTN_IGUAL)
        );
    }
    public static SumaTask operacionSuma() {return new SumaTask();}
}
