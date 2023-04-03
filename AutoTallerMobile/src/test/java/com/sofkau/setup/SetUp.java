package com.sofkau.setup;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static com.sofkau.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;

public class SetUp {

    protected Actor actor = Actor.named("User");
    @Managed(driver = "Appium")
    protected WebDriver theMobileDevice;

    protected void setUplog4j() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }

    protected void quitarDriver() {
        theMobileDevice.quit();
    }
}
