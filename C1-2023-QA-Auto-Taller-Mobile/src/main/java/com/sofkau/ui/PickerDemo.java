package sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.*;

public class PickerDemo {



    public static final Target BOTON_PICKER = Target
            .the("PIKER DEMO")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Picker Demo\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));



    public static final Target BOTON_SELECT_MES = Target
            .the("BOTON SELECT MES")
            .located(xpath("//android.widget.Spinner[@content-desc=\"monthPicker\"]/android.widget.TextView\n"));



    public static final Target BOTON_MES = Target
            .the("BOTON MES")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[10]"));


    public static final Target BOTON_SELECT_DIA = Target
            .the("BOTON SELECT DIA")
            .located(xpath("//android.widget.Spinner[@content-desc=\"dayPicker\"]/android.widget.TextView\n"));




    public static final Target BOTON_DIA = Target
            .the("BOTON DIA")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[10]\n"));





    public static final Target BOTON_LEER_MAS = Target
            .the("BOTON LEER MAS")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"learnMore\"]/android.widget.TextView"));









}
