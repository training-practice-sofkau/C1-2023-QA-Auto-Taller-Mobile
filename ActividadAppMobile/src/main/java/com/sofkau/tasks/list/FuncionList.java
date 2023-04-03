package com.sofkau.tasks.list;

import com.sofkau.tasks.webview.FuncionWebView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.sofkau.ui.list.List.LEER_MAS;
import static com.sofkau.ui.list.List.OBJETO;

public class FuncionList implements Task {
    public static String obj;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Target.the("")
                        .located(By.xpath(String.format(OBJETO,obj)))),
                Click.on(LEER_MAS)
        );
    }

    public static FuncionList funcionList(){
        return new FuncionList();
    }
}
