package sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sofkau.ui.InicioSesion;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static sofkau.ui.InicioSesion.*;

public class InicioSesionTask implements Task {


    private String user;
    private String password;


    public InicioSesionTask conElUsuario(String user) {
        this.user = user;
        return this;
    }


    public InicioSesionTask yconElPassword(String password) {
        this.password = password;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_LOGIN),
                Enter.theValue(user).into(CAMPO_USER),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Click.on(BOTON_OK)


        );

    }


    public static InicioSesionTask inicioSesion() {
        return new InicioSesionTask();
    }
}
