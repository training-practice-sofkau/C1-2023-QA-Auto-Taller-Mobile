package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSesionIniciada {
    public static final Target RESULT = Target.the("Result")
            .located(By.xpath("(//android.widget.FrameLayout/android.widget.TextView)[2]"));
}
