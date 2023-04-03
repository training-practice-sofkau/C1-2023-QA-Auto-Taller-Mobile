package sofkau.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;


public class TheResultPicker {


    public static final Target MENSAJE_EVENTO = Target
            .the("MENSAJE FINAL")
            .located(id("android:id/message"));

    public static Question<String> isEqualTo(String s) {
        return TheTarget.textOf(MENSAJE_EVENTO);
    }

    private TheResultPicker() {
    }
}
