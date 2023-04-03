package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import static io.appium.java_client.AppiumBy.xpath;

public class ValidarLoginExitoso {
    public static final Target MENSAJE_EXITOSO = Target
            .the("Mensaje de login exitoso")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                    "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android." +
                    "widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[2]"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_EXITOSO);
    }
    private ValidarLoginExitoso(){

    }
}
