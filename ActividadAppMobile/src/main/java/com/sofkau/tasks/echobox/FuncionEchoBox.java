package com.sofkau.tasks.echobox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.InterfazPrincipal.ECHO_BOX;
import static com.sofkau.ui.echobox.EchoBox.BOTON_SAVE_ECHOBOX;
import static com.sofkau.ui.echobox.EchoBox.CAMPO_TEXTO_ECHOBOX;

public class FuncionEchoBox implements Task {

    public static String mensaje;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_TEXTO_ECHOBOX),
                Enter.theValue(mensaje).into(CAMPO_TEXTO_ECHOBOX),
                Click.on(BOTON_SAVE_ECHOBOX)
        );
    }

    public static FuncionEchoBox funcionEchoBox(){
        return new FuncionEchoBox();
    }
}
