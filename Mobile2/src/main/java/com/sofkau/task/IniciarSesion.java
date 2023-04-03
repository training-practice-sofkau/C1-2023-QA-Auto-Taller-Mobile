package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.HomeApp.LOGIN_OPTION;
import static com.sofkau.ui.LoginView.*;

public class IniciarSesion implements Task {
    private String username;
    private String password;

    public IniciarSesion conUser(String username){
        this.username=username;
        return this;
    }
    public IniciarSesion conPass(String password){
        this.password=password;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USER_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON)
        );
    }
    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
