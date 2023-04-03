package com.sofkau.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class SelectedPhotoMessage {

    public static final Target CLOUD_SELECTION_MESSAGE = Target
            .the("Titulo de stuff seleccionado")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(CLOUD_SELECTION_MESSAGE);
    }
    private SelectedPhotoMessage() {
    }


}
