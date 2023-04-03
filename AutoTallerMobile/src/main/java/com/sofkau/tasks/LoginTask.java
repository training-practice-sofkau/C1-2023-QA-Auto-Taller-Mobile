package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.LoginScreen.*;

public class LoginTask implements Task {
    private String userName;
    private String password;

    public LoginTask conElUsuario(String userName){
        this.userName = userName;
        return this;
    }

    public LoginTask yConElPassword(String password){
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(USER_NAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static LoginTask loginTask(){
        return new LoginTask();
    }
}
