package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.sofkau.ui.ListDemoLocalizador.BTN_MAYOR_QUE_CUMULONIMBUS;
import static com.sofkau.ui.ListDemoLocalizador.BTN_MAYOR_QUE_LIST_DEMO;

public class ListaDemTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_MAYOR_QUE_LIST_DEMO),
                Click.on(BTN_MAYOR_QUE_CUMULONIMBUS)


        );
    }

    public static ListaDemTask listaDemTask() {return new ListaDemTask();}
}
