package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.test.ui.PaginaPortapapeles.*;

public class GuardarEnPortapapeles implements Task {
    private String text;
    public GuardarEnPortapapeles conElTexto(String text){
        this.text= text;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(text).into(CAMPO_CLIPBOARD),
                Click.on(BTN_GUARDAR),
                Click.on(BTN_REFRESH)
        );
    }
    public static GuardarEnPortapapeles guardarEnPortapapeles(){
        return new GuardarEnPortapapeles();
    }
}
