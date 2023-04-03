package com.sofkau.questions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class LogOutButton {

    public static final Target LOGOUT_BUTTON = Target.the("Boton LogUot")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(LOGOUT_BUTTON);
    }
    private LogOutButton() {
    }
}
