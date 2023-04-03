package com.test.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFotos {

    public static final Target MENSAJE_FOTO = Target.the("Opcion de seleccionar mes")
            .located(By.id("android:id/message"));
}
