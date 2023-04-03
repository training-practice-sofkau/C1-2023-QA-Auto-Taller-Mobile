package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.PaginaPickerDemo.*;

public class PickerDemoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PICKER_DEMO),
                Click.on(MES),
                Click.on(FEBRERO),
                Click.on(DIA),
                Click.on(DIA_SEIS),
                Click.on(BOTON_LEARN_MORE)
        );
    }

    public static PickerDemoTask pickerDemoTask() {return new PickerDemoTask();}
}
