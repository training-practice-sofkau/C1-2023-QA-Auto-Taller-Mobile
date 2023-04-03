package com.test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDates {

    public static final Target SELECCIONAR_MES = Target.the("Opcion de seleccionar mes")
            .located(AppiumBy.accessibilityId("monthPicker"));

    public static final Target SELECCIONAR_DIA = Target.the("Opcion de seleccionar dia")
            .located(AppiumBy.accessibilityId("dayPicker"));

    public static final Target BTN_LEARN = Target.the("Boton aprender sobre la fecha")
            .located(By.xpath("//android.view.ViewGroup[@content-desc='learnMore']"));

    public static final Target MENSAJE_DATES = Target.the("Mensaje de aprendizaje de fecha")
            .located(By.xpath("(//android.widget.TextView)[2]"));
}
