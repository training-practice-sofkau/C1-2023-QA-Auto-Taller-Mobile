package com.test.task;

import com.test.utils.SetPhoto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarFoto implements Task {
    private int foto;

    public SeleccionarFoto conLaFoto(int foto){
        this.foto= foto;
        return this;
    }

    public Target FOTO;

    @Override
    public <T extends Actor> void performAs(T actor) {
        FOTO = SetPhoto.setMonth(foto);
        actor.attemptsTo(
                Click.on(FOTO)
        );
    }
    public static SeleccionarFoto seleccionarFoto(){
        return new SeleccionarFoto();
    }
}
