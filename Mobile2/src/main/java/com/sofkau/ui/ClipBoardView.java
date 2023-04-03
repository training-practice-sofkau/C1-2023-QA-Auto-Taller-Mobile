package com.sofkau.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ClipBoardView {

    public static final Target NEW_INPUT=Target.the("Campo para nuevo clipboard")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"messageInput\"]"));
    public static final Target BUTTON_SET_CLIPBOARD=Target.the("Boton para setear el texto")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"setClipboardText\"]/android.widget.TextView"));

    public static final Target BUTTON_REFRESH=Target.the("Boton para refrescar el texto")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"refreshClipboardText\"]/android.widget.TextView"));


}
