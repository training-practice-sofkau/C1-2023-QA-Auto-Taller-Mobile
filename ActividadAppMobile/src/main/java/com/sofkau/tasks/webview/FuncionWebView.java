package com.sofkau.tasks.webview;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.webview.WebView.*;

public class FuncionWebView implements Task {
    public static String zelda;

    public static String button;
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(button);
        actor.attemptsTo(
                Enter.theValue(zelda).into(CAMPO_URL)
        );

        if(button.equals("Go")){
            actor.attemptsTo(
                    Click.on(BOTON_GO)
            );
        }else if(button.equals("Clear")){
            actor.attemptsTo(
                    Click.on(BOTON_CLEAR)
            );
        }
        System.out.println(CAMPO_URL.resolveFor(actor).getText());


    }

    public static FuncionWebView funcionWebView(){
        return new FuncionWebView();
    }
}
