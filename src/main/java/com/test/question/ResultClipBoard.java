package com.test.question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static io.appium.java_client.AppiumBy.xpath;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ResultClipBoard {

    public static final Target RESULTO = Target.the("Result")
            .locatedBy("//android.widget.TextView[@content-desc='el dia esta muy soleado']");
    public static final Target RESULTOPTION2 = Target.the("Result2")
            .locatedBy("//android.widget.TextView[@content-desc='que rico piscina']");




}
