package com.test.utils;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SetDates {
    public static Target setMonth(int month){
        Target MONTH_SELECTED = Target.the("Mes seleccionado")
                .located(By.xpath(String.format("(//android.widget.CheckedTextView)[%s]", month)));
        return MONTH_SELECTED;
    }

    public static Target setDay(int day){
        Target DAY_SELECTED = Target.the("Dia seleccionado")
                .located(By.xpath(String.format("(//android.widget.CheckedTextView)[%s]", day)));
        return DAY_SELECTED;
    }

}
