package sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static sofkau.ui.EchoBox.*;

public class EchoBoxTask implements Task {

    private String mensaje;


    public EchoBoxTask conElMensaje(String mensaje) {
        this.mensaje = mensaje;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BOTON_IR_ECHO),
                Enter.theValue(mensaje).into(CAMPO_MENSAJE),
                Click.on(BOTON_SAVE)


        );

    }


    public static EchoBoxTask echoBox() {
        return new EchoBoxTask();
    }

}
