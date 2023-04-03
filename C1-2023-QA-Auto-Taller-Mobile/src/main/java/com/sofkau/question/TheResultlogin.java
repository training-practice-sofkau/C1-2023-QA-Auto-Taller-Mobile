package sofkau.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class TheResultlogin {


    public static final Target MENSAJE_LOGIN = Target
            .the("MENSAJE DE LOGIN")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[2]"));

    public static Question<String> isEqualTo() {
        return TheTarget.textOf(MENSAJE_LOGIN);
    }

    private TheResultlogin() {
    }

}
