package com.sofkau.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class LoginScreen extends PageObject {

    public static final Target USER_NAME = Target.the("user name")
            .located(AppiumBy.accessibilityId("username"));

    public static final Target PASSWORD = Target.the("password")
            .located(AppiumBy.accessibilityId("password"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView"));




}
