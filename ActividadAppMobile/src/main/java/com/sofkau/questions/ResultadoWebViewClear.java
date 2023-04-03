package com.sofkau.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.sofkau.ui.webview.WebView.CAMPO_URL;

public class ResultadoWebViewClear {

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(CAMPO_URL);
    }
    private ResultadoWebViewClear(){

    }
}
