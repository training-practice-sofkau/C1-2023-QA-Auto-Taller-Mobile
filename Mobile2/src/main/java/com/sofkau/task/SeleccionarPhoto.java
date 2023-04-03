package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.ListDemoView.STUFF_OPTION;
import static com.sofkau.ui.PhotoDemoView.PHOTO_OPTION;

public class SeleccionarPhoto implements Task {
    private String id;
    public SeleccionarPhoto elId(String id){
        this.id=id;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(String.format(PHOTO_OPTION,id))
        );
    }
    public static SeleccionarPhoto seleccionarPhoto(){ return new SeleccionarPhoto();
    }
}
