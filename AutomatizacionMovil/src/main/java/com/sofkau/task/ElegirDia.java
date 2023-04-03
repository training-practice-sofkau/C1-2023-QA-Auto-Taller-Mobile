package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

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
        actor.attemptsTo(
                Click.on(DIA),
                Click.on(elegirDiaUniversal(dia))
        );
    }
    public static ElegirDia elegirDia() {return new ElegirDia();}
}
