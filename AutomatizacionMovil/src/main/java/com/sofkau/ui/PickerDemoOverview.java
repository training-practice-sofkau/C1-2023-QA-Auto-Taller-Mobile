package com.sofkau.ui;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class PickerDemoOverview {
    public static final Target PICKER_DEMO= Target.the("Opcion picker demo")
            .located(AppiumBy.accessibilityId("Picker Demo"));
    public static final Target MES=Target.the("Escoger Mes")
            .located(AppiumBy.accessibilityId("monthPicker"));
    public static final Target DIA=Target.the("Escoger dia")
            .located(AppiumBy.accessibilityId("dayPicker"));
    public static final Target LEARN_MORE=Target.the("Finalizar proceso")
            .located(AppiumBy.accessibilityId("learnMore"));
    public static final Target TITULO=Target.the("Titulo final")
            .located(AppiumBy.id("android:id/alertTitle"));
    public static final Target MENSAJE=Target.the("Mensaje final")
            .located(AppiumBy.id("android:id/message"));
    public static Target elegirMesUniversal(int intUno){
        Target mes=Target.the(" Elegir mes")
                .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView["+intUno+"]"));
        return mes;
    }
    public static Target elegirDiaUniversal(int intUno){
        Target dia=Target.the(" Elegir dia")
                .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView["+intUno+"]"));
        return dia;
    }
}

