package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PickerDemoScreen extends PageObject {

    public static final Target MONTH_PICKER = Target.the("month picker")
            .located(By.xpath("//android.widget.Spinner[@content-desc=\"monthPicker\"]/android.widget.TextView"));

    public static final Target DAY_PICKER = Target.the("day picker")
            .located(By.xpath("//android.widget.Spinner[@content-desc=\"dayPicker\"]/android.widget.TextView"));

    public static final Target PICK_MONTH = Target.the("pick month")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

    public static final Target PICK_DAY = Target.the("pick day")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));

    public static final Target LEARN_MORE_BUTTON = Target.the("learn more button")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"learnMore\"]/android.widget.TextView"));



}
