package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.PickerDemoOverview.DIA;
import static com.sofkau.ui.PickerDemoOverview.elegirDiaUniversal;

public class ElegirDia implements Task {
    private int dia;
    public ElegirDia conElDia(int dia){
        this.dia=dia;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (dia<17)
            actor.attemptsTo(
                    Click.on(DIA),
                    Click.on(elegirDiaUniversal(dia))
            );
        else
            actor.attemptsTo(
                    Click.on(DIA),
                    Click.on(elegirDiaUniversal(17)),
                    Click.on(DIA),
                    Click.on(elegirDiaUniversal(16))
            );
    }
    public static ElegirDia elegirDia() {return new ElegirDia();}
}
