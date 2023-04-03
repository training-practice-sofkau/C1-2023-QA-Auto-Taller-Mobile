package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.sofkau.ui.SecretArea.LOGIN_AS_MESSAGE;

public class LoginResult implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LOGIN_AS_MESSAGE.resolveFor(actor).getText();
    }

    public static LoginResult loginResult(){
        return new LoginResult();
    }
}
