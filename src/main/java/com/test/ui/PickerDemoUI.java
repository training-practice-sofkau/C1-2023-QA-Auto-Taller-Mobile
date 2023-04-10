package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.xpath;

public class PickerDemoUI {
    public static final Target BOTON_PickerDemo = Target
            .the("PickerDemo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Picker Demo\"]/android.widget.TextView[1]"));
    public static final Target BOTON_MES = Target
            .the("Mes")
            .located(xpath("//android.widget.Spinner[@content-desc=\"monthPicker\"]"));
    public static final Target MES = Target
            .the("Mess")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[11]"));
    public static final Target BOTON_DIA = Target
            .the("Dia")
            .located(xpath("//android.widget.Spinner[@content-desc=\"dayPicker\"]"));
    public static final Target DIA = Target
            .the("Diaa")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
    public static final Target BOTON_LEARN_MORE = Target
            .the("Learn More")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"learnMore\"]/android.widget.TextView"));
    public static final Target MENSAJE_ASERCION = Target
            .the("On this day (11/5) in 1911...")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));

    private PickerDemoUI() {
    }
}
