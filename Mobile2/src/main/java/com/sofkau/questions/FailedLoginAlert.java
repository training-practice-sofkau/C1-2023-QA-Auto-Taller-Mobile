package com.sofkau.questions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class FailedLoginAlert {
    public static final Target ALERT_MESSAGE = Target.the("Mensaje de alerta")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(ALERT_MESSAGE);
    }

    public FailedLoginAlert() {
    }
}
