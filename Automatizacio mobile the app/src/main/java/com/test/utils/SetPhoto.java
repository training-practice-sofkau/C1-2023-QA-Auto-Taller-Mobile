package com.test.utils;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SetPhoto {
    public static Target setMonth(int photo){
        Target PHOTO_SELECTED = Target.the("Foto seleccionada")
                .located(By.xpath(String.format("(//android.widget.ImageView)[%s]", photo)));
        return PHOTO_SELECTED;
    }
}
