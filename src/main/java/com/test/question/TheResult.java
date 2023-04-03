package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;


public class TheResult {

    public static final Target RESULT_ECHO = Target
            .the("aserción echo")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[1]"));


    public static Question<String> isEqualTo(){
        return TheTarget.textOf(RESULT_ECHO);
    }

    private TheResult() {
    }

}
