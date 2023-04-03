package com.sofkau.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginFallido {
    public static final Target MENSAJE_LOGIN_FALLIDO=Target.the("")
            .located(By.id("android:id/alertTitle"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_LOGIN_FALLIDO);
    }

    private LoginFallido(){

    }

}
