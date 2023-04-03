package com.sofkau.task;

import com.sofkau.ui.ClickHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static com.sofkau.ui.LoginScreen.*;
import static com.sofkau.ui.LoginScreen.BOTON_LOGIN;

public class ClickHomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(ClickHome.BTN_MAYOR_QUE)

        );
    }

    public static ClickHomeTask clickHomeTask() {return new ClickHomeTask();}
}
