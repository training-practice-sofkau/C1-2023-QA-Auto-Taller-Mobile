package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.test.ui.PaginaLogin.*;

public class LoginTask implements Task {
    private String user;
    private String password;

    public LoginTask conElUsuario(String user){
        this.user = user;
        return this;
    }

    public LoginTask conelPassword(String password){
        this.password = password;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN_SCREEN),
                Click.on(CAMPO_USER),
                Enter.theValue(user).into(CAMPO_USER),
                Click.on(CAMPO_PASSWORD),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginTask loginTask(){return new LoginTask();}
}
