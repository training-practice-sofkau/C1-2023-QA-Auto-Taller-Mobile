package sofkau.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class TheResultEchoBox {



    public static final Target MENSAJE_GUARDAOD = Target
            .the("MENSAJE GAURDADO")
            .located(accessibilityId("hola mundo soy yeison"));

    public static Question<String> isEqualTo() {
        return TheTarget.textOf(MENSAJE_GUARDAOD);
    }

    private TheResultEchoBox() {
    }


}
