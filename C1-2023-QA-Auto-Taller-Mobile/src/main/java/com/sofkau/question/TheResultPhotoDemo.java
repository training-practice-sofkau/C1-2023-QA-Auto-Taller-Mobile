package sofkau.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import static io.appium.java_client.AppiumBy.id;

public class TheResultPhotoDemo {


    public static final Target MENSAJE_PHOTO = Target
            .the("INFORMACION DE LA FOTO")
            .located(id("android:id/message"));

    public static Question<String> isEqualTo() {
        return TheTarget.textOf(MENSAJE_PHOTO);
    }

    private TheResultPhotoDemo() {
    }


}
