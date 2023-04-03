package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {
    public static final Target OPCION_LOGIN = Target.the("Opcion de login")
            .located(By.xpath("//android.view.ViewGroup[@content-desc='Login Screen']"));

}
