package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.xpath;

public class PaginaPickerDemo {
    public static final Target BTN_PICKER_DEMO = Target
            .the("Pantalla de picker demo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Picker Demo\"]/android.view.ViewGroup/android" +
                    ".view.ViewGroup/android.widget.TextView"));

    public static final Target MES = Target
            .the("Combobox mes")
            .located(xpath("//android.widget.Spinner[@content-desc=\"monthPicker\"]/android.widget.TextView"));

    public static final Target FEBRERO = Target
            .the("Mes febrero")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget." +
                    "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

    public static final Target DIA = Target
            .the("Combobox dia")
            .located(xpath("//android.widget.Spinner[@content-desc=\"dayPicker\"]/android.widget.TextView"));

    public static final Target DIA_SEIS = Target
            .the("Dia seis")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget." +
                    "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]"));

    public static final Target BOTON_LEARN_MORE = Target
            .the("Boton learn more")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"learnMore\"]/android.widget.TextView"));

}
