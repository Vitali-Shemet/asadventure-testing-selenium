package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class Hooks {

    @After
    public void afterScenario() {
        DriverFactory.closeDriver();
    }
}
