package com.sofkau.tasks.login;

import com.sofkau.tasks.echobox.FuncionEchoBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.login.Login.*;

public class FuncionLogin implements Task {

    public static String us;
    public static String cc;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(us).into(CAMPO_USUARIO),
                Enter.theValue(cc).into(CAMPO_CONTRASENIA),
                Click.on(BOTON_LOGIN)
        );

    }

    public static FuncionLogin funcionLogin(){
        return new FuncionLogin();
    }
}
