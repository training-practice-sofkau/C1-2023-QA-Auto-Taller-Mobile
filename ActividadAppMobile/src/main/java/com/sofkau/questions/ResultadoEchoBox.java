package com.sofkau.questions;

import com.sofkau.tasks.echobox.FuncionEchoBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.sofkau.tasks.echobox.FuncionEchoBox.mensaje;

public class ResultadoEchoBox {

    public static String CONFIRMAR_ECHOBOX="//android.widget.TextView[@content-desc=\"%s\"]";

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(Target.the("")
                .located(By.xpath(String.format(CONFIRMAR_ECHOBOX,mensaje))));
    }

    private ResultadoEchoBox(){

    }

}
