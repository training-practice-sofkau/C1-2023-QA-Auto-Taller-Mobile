package com.sofkau.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;


public class MensajeListaDemo {

    public static final Target MENSAJE_CONFIRMACION_LISTA_DEMO = Target
            .the("Mensaje de confirmacion")
            .located(id("android:id/alertTitle"));

public static Question<String> isEqualTo(){
    return TheTarget.textOf(MENSAJE_CONFIRMACION_LISTA_DEMO);
}
    private MensajeListaDemo() {
    }


}
