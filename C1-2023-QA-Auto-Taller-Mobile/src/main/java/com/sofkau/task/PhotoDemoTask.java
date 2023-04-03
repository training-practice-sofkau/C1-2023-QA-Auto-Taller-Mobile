package sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static sofkau.ui.PhotoDemo.*;

public class PhotoDemoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_IR_PHOTODEMO),
                Click.on(BOTON_PHOTO_1)
                //Click.on(BOTON_OK)


        );

    }


    public static PhotoDemoTask photoDemo() {
        return new PhotoDemoTask();
    }

}
