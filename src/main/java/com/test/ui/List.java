package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.By.id;

public class List {
    public static final Target BTN_LIST = Target
            .the("opcion list")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"List Demo\"]"));
    public static final Target BTN_FOG = Target
            .the("opcion fog")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"Fog\"]"));
    public static final Target BTN_LEARN = Target
            .the("opcion learn")
            .located(id("android:id/button3"));
     public static final Target BTN_CONFIRM = Target
            .the("opcion confirmacion")
            .located(id("android:id/message"));

}
