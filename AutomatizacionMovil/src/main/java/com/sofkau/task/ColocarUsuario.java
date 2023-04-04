package com.sofkau.task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.LoginOverview.USERNAME;

public class ColocarUsuario implements Task {
    private String username;
    public ColocarUsuario conElUsuario(String username){
        this.username=username;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.setSessionVariable("login.username").to(username);
        CharSequence nombre=Serenity.sessionVariableCalled("login.username");
        actor.attemptsTo(
                Enter.theValue(nombre).into(USERNAME)
        );
    }
    public static ColocarUsuario colocarUsuario() {
        return new ColocarUsuario();
    }
}
