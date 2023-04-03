package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.test.ui.ClipBoard.*;

public class ClipBoardTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_TYPE),
                Enter.theValue("el dia esta muy soleado").into(BTN_TYPE),
                Click.on(BTN_SET),
                Click.on(BTN_REFRESH)

        );

    }

    public static ClipBoardTask clipBoardTask() {return new ClipBoardTask();}
}
