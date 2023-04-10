package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.test.ui.LoginUI.*;

public class IniciarSesionTask implements Task {
    private String usuario;
    private String contrasenna;

    public IniciarSesionTask Usuario(String usuario){
        this.usuario=usuario;
        return this;
    }

    public IniciarSesionTask Contrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(FUNCIONALIDAD_LOGIN_SCREEN),
                Click.on(CAMPO_USERNAME),
                Enter.theValue(usuario).into(CAMPO_USERNAME),
                Click.on(CAMPO_PASSWORD),
                Enter.theValue(contrasenna).into(CAMPO_PASSWORD),
                Click.on(BOTON_LOGIN)

        );
    }
    public static IniciarSesionTask iniciarSesionTask() {return new IniciarSesionTask();}
}
