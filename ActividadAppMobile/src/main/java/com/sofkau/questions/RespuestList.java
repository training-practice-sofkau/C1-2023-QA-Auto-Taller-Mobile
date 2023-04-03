package com.sofkau.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RespuestList {
    public static final Target RESPUESTA_LIST=Target.the("")
            .located(By.id("android:id/alertTitle"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(RESPUESTA_LIST);
    }

    private RespuestList(){

    }
}
