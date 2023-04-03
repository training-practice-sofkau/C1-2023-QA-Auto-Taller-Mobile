package sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.*;


public class PhotoDemo {


    public static final Target BOTON_IR_PHOTODEMO = Target
            .the("IR PHOTODEMO")
            .located(xpath("    //android.view.ViewGroup[@content-desc=\"Photo Demo\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\n"));


    public static final Target BOTON_PHOTO_1 = Target
            .the("PHOTO 1")
            .located(xpath("    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView\n"));


    public static final Target BOTON_OK = Target
            .the("PASSWORD")
            .located(id("android:id/button1"));


}
