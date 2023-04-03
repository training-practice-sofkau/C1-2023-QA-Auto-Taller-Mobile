package com.test.task;

import com.test.utils.SetDates;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static com.test.ui.PaginaDates.*;


public class SeleccionarDate implements Task {
    private int day;
    private int month;

    public SeleccionarDate conElMes(int month){
        this.month= month;
        return this;
    }

    public SeleccionarDate yElDia(int dia){
        this.day= dia;
        return this;
    }
    public Target MONTH;
    public Target DAY;

    @Override
    public <T extends Actor> void performAs(T actor) {
        MONTH = SetDates.setMonth(month);
        DAY =SetDates.setDay(day);
        actor.attemptsTo(
                Click.on(SELECCIONAR_MES),
                Click.on(MONTH),
                Click.on(SELECCIONAR_DIA),
                Click.on(DAY),
                Click.on(BTN_LEARN)
        );
    }
    public static SeleccionarDate seleccionarDate(){
        return new SeleccionarDate();
    }
}
