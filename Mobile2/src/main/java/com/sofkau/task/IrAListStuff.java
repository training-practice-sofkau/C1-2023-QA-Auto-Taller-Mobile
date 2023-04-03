package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomeApp.LIST_DEMO_OPTION;
import static com.sofkau.ui.HomeApp.LOGIN_OPTION;

public class IrAListStuff implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((LIST_DEMO_OPTION))
        );
    }
    public static IrAListStuff irAListStuff(){
        return new IrAListStuff();
    }
}
