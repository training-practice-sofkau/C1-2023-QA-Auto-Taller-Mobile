package com.sofkau.tasks.webview;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.InterfazPrincipal.WEBVIEW;

public class NavegarAWebView implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WEBVIEW)
        );
    }

    public static NavegarAWebView navegarAWebView(){
        return new NavegarAWebView();
    }
}
