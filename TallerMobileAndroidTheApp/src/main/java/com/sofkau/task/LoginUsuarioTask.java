package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;


import static com.sofkau.ui.LoginScreen.*;

public class LoginUsuarioTask implements Task {

    private String usuario;
    private String password;

    public LoginUsuarioTask conUsuario(String usuario){
        this.usuario = usuario; return this;}

    public LoginUsuarioTask conPassword(String password){
        this.password = password; return this;}


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(


                Enter.theValue(usuario).into(NOMBRE_USURIO),
                Enter.theValue(password).into(PASSWORD_USUARIO),
                Click.on(BOTON_LOGIN)
        );
    }

    public static LoginUsuarioTask loginUsuarioTask() {return new LoginUsuarioTask();}
}
