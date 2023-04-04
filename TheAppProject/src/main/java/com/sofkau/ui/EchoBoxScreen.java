package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class EchoBoxScreen {
    public static final Target TEXT_BOX = Target.the("Input text box")
            .located(xpath("//android.widget.EditText[@content-desc='messageInput']"));

    public static final Target SAVE_BTTN = Target.the("Save button")
            .located(xpath("//android.view.ViewGroup[@content-desc='messageSaveBtn']"));

    public static final Target VIEW_TEXT = Target.the("View text")
            .located(xpath("(//android.widget.TextView[contains(@content-desc,'')])[2]"));
}