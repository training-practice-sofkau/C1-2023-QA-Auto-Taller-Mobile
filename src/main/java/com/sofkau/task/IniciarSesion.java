package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.sofkau.ui.LoginScreen.*;

public class IniciarSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        actor.attemptsTo(
                Click.on(LOGIN),
                Enter.theValue(username).into(USERNAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }
    public static IniciarSesion iniciarSesion() {
        return new IniciarSesion();
    }
}

