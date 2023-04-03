package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.PickerDemoUI.*;

public class NavegarPickerDemoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BOTON_PickerDemo),
                Click.on(BOTON_MES),
                Click.on(MES),
                Click.on(BOTON_DIA),
                Click.on(DIA),
                Click.on(BOTON_LEARN_MORE)
        );
    }
    public static NavegarPickerDemoTask navegarPickerDemoTask() {return new NavegarPickerDemoTask();}

}
