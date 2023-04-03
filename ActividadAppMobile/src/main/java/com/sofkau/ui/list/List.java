package com.sofkau.ui.list;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class List {

    public static String OBJETO ="//android.view.ViewGroup[@content-desc=\"%s\"]/android.widget.TextView";

    public static final Target LEER_MAS=Target.the("")
            .located(By.id("android:id/button3"));

}
