package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.test.ui.LoginTheApp.*;

public class LoginTask implements Task {
    private String user;
    private String pass;

    public LoginTask conUser(String user) {
        this.user = user;
        return this;
    }

    public LoginTask yPass(String pass) {
        this.pass = pass;
        return this;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(user).into(INPUT_USER),
                Enter.theValue(pass).into(INPUT_PASS),
                Click.on(BUTTON_LOGOUT)
        );
    }

    public static LoginTask loginTask() {return new LoginTask();}
}
