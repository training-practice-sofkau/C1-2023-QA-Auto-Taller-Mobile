package com.sofkau.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EchoBoxScreen extends PageObject {

    public static final Target TEXT_BOX = Target.the("text box")
            .located(AppiumBy.accessibilityId("messageInput"));

    public static final Target SAVE_BUTTON = Target.the("save button")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"messageSaveBtn\"]/android.widget.TextView"));

    public static final Target MESSAGE = Target.the("message")
            .located(By.id("%s"));

    public static final Target ECHO_BOX_SAVED_MESSAGE = Target.the("saved text")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[1]"));


}
