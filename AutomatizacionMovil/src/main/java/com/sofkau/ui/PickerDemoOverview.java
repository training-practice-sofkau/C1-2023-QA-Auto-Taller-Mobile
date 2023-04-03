package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.xpath;

public class PickerDemoOverview {
    public static final Target PICKER_DEMO= Target.the("Opcion picker demo")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Picker Demo\"]/android.widget.TextView[1]"));
    public static final Target MES=Target.the("Escoger Mes")
            .located(xpath("//android.widget.Spinner[@content-desc=\"monthPicker\"]/android.widget.TextView"));
    public static final Target DIA=Target.the("Escoger dia")
            .located(xpath("//android.widget.Spinner[@content-desc=\"dayPicker\"]/android.widget.TextView"));
    public static final Target LEARN_MORE=Target.the("Finalizar proceso")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"learnMore\"]/android.widget.TextView"));
    public static Target elegirMesUniversal(int intUno){
        Target mes=Target.the(" Elegir mes")
                .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView["+intUno+"]"));
        return mes;
    }
    public static Target elegirDiaUniversal(int intUno){
        Target dia=Target.the(" Elegir dia")
                .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView["+intUno+"]"));
        return dia;
    }
}

