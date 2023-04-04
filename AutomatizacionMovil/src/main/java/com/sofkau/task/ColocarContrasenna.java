package com.sofkau.task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.LoginOverview.CONTRASENNA;

public class ColocarContrasenna implements Task {
    private String contrasenna;
    public ColocarContrasenna conLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.setSessionVariable("login.password").to(contrasenna);
        CharSequence password=Serenity.sessionVariableCalled("login.password");
        actor.attemptsTo(
                Enter.theValue(password).into(CONTRASENNA)
        );
    }
    public static ColocarContrasenna colocarContrasenna(){
        return new ColocarContrasenna();
    }
}