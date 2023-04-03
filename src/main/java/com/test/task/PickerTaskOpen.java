package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.Picker.BTN_PICKER;

public class PickerTaskOpen implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_PICKER)
    );
    }
    public static PickerTaskOpen pickerTaskOpen() {return new PickerTaskOpen();}

}
