package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.test.ui.LoginScreen.*;

public class IniciarSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LOGIN),
                Enter.theValue("Alice").into(USERNAME),
                Enter.theValue("mypassword").into(PASSWORD),
                Click.on(BTN_LOOGIN)

        );
    }
    public static IniciarSesion iniciarSesion() {return new IniciarSesion();
    }
}
