package com.sofkau.tasks.echobox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.InterfazPrincipal.ECHO_BOX;

public class NavegarAEchoBox implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ECHO_BOX)
        );
    }

    public static NavegarAEchoBox navegarAEchoBox(){
        return new NavegarAEchoBox();
    }
}
