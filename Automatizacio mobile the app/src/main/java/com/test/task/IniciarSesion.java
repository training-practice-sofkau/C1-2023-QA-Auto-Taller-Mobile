package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.test.ui.PaginaLogin.*;

public class IniciarSesion implements Task {
    private String user;
    private String password;

    public IniciarSesion conElUsuario(String user){
        this.user=user;
        return this;
    }

    public IniciarSesion yLaContrasenna(String password){
        this.password=password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(CAMPO_USER),
                Enter.theValue(password).into(CAMPO_PASSWD),
                Click.on(BTN_LOGIN)
        );
    }
    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
