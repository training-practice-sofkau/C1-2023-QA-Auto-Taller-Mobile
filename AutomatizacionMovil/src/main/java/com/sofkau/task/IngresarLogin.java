package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.LoginOverview.LOGIN;
public class IngresarLogin implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN)
        );
    }
    public static IngresarLogin ingresarLogin(){ return new IngresarLogin();}
}
