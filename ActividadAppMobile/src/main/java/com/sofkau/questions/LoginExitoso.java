package com.sofkau.questions;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginExitoso {
    public static final Target MENSAJE_LOGIN_EXITOSO= Target.the("")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[1]"));


    public static Question<String>isEqualTo(){
        return TheTarget.textOf(MENSAJE_LOGIN_EXITOSO);
    }

    private LoginExitoso(){

    }
}
