package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.EchoBoxScreen.SAVE_BUTTON;
import static com.sofkau.ui.EchoBoxScreen.TEXT_BOX;

public class EnterText implements Task {

    private String text;

    public EnterText conElText(String text){
        this.text = text;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(text).into(TEXT_BOX),
                Click.on(SAVE_BUTTON)
        );
    }

    public static EnterText enterText(){
        return new EnterText();
    }
}
