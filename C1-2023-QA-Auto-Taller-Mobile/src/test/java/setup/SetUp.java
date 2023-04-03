package setup;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import static util.Log4jValues.LOG4J_PROPERTY_PATH;

public class SetUp {

    protected Actor actor = Actor.named("User");
    @Managed(driver = "Appium")
    protected WebDriver theMobileDevice;


    private void setUpLog4j() {
        PropertyConfigurator.configure(LOG4J_PROPERTY_PATH.getValue());
    }

}
