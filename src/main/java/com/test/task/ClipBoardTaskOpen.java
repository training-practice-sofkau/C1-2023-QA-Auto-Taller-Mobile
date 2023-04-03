package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.ClipBoard.BTN_CLICKBORAD;

public class ClipBoardTaskOpen implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CLICKBORAD)
        );
    }
    public static ClipBoardTaskOpen clipBoardTaskOpen() {return new ClipBoardTaskOpen();}
}
