package com.sofkau.questions;

import com.sofkau.tasks.webview.FuncionWebView;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.sofkau.tasks.webview.FuncionWebView.*;
import static com.sofkau.ui.webview.WebView.CAMPO_URL;

public class ResultadoWebView {

    public static final Target MENSAJE_GO=Target.the("")
            .located(By.id("android:id/message"));
    public static Question<String> isEqualTo(){
            return TheTarget.textOf(MENSAJE_GO);
    }
    private ResultadoWebView(){

    }
}
