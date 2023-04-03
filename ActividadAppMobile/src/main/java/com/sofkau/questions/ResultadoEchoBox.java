package com.sofkau.questions;

import com.sofkau.tasks.echobox.FuncionEchoBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.sofkau.tasks.echobox.FuncionEchoBox.mensaje;

public class ResultadoEchoBox implements Question<String>{

    public static final Target RESULTADO_ECHO_BOX=Target.the("")
            .located(By.xpath("//android.widget.TextView[@content-desc=\""+mensaje+"\"]"));

    public static final Target RESULTADO_ECHO_BO=Target.the("")
            .located(By.id(mensaje));

    public static final Target RESULTADO_ECHO_B=Target.the("")
            .located(By.className("android.widget.TextView"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(RESULTADO_ECHO_BO);
    }

    private ResultadoEchoBox(){

    }
    @Override
    public String answeredBy(Actor actor) {
        return RESULTADO_ECHO_B.resolveFor(actor).getText();
    }

    public static ResultadoEchoBox resultadoEchoBox(){
        return new ResultadoEchoBox();
    }
}
