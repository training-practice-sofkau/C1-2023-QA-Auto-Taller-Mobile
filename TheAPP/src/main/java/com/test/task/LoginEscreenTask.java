package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.LoginTheApp.LOGIN_SCREEN;

public class LoginEscreenTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LOGIN_SCREEN)

        );
    }

    public static LoginEscreenTask loginEscreenTask () {return new LoginEscreenTask();}
}
