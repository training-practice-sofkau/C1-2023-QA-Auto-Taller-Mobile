package com.sofkau.tasks.list;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.InterfazPrincipal.LIST;

public class NavegarAList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIST)
        );

    }

    public static NavegarAList navegarAList(){
        return new NavegarAList();
    }
}
