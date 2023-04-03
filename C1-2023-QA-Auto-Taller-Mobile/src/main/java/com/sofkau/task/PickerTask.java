package sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static sofkau.ui.PhotoDemo.BOTON_IR_PHOTODEMO;
import static sofkau.ui.PhotoDemo.BOTON_PHOTO_1;
import static sofkau.ui.PickerDemo.*;

public class PickerTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PICKER),
                Click.on(BOTON_SELECT_MES),
                Click.on(BOTON_MES),
                Click.on(BOTON_SELECT_DIA),
                Click.on(BOTON_DIA),
                Click.on(BOTON_LEER_MAS)
        );
    }


    public static PickerTask pickerTask() {
        return new PickerTask();
    }

}
