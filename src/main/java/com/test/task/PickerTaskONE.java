package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.Picker.*;

public class PickerTaskONE implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_MES),
            Click.on(BTN_OCTOBER),
            Click.on(BTN_DIA),
            Click.on(BTN_07),
            Click.on(BTN_ENVIAR)

    );
    }
    public static PickerTaskONE pickerTaskONE() {return new PickerTaskONE();}
}
