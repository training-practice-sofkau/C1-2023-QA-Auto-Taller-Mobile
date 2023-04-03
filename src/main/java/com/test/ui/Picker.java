package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static io.appium.java_client.AppiumBy.xpath;

public class Picker {
    public static final Target BTN_PICKER = Target
            .the("opcion picker")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Picker Demo\"]"));
    public static final Target BTN_VALIDACION_TITLE = Target
            .the("opcion picker")
            .located(id("android:id/alertTitle"));
    public static final Target BTN_MES = Target
            .the("mes")
            .located(xpath("//android.widget.Spinner[@content-desc=\"monthPicker\"]/android.widget.TextView"));
    public static final Target BTN_DIA = Target
            .the("dia")
            .located(xpath("//android.widget.Spinner[@content-desc=\"dayPicker\"]/android.widget.TextView"));

    public static final Target BTN_ENVIAR = Target
            .the("opcion photo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"learnMore\"]/android.widget.TextView"));
    public static final Target BTN_OCTOBER = Target
            .the("October")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[10]"));
    public static final Target BTN_07 = Target
            .the("7")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
    public static final Target BTN_SEPTEMBER = Target
            .the("September")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[9]"));
    public static final Target BTN_4 = Target
            .the("4")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
}
