package stepDef;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.executors.HomePage;
import util.DriverFactory;

public class MyStepdefs {

    HomePage homePage = new HomePage();
    WebDriver driver = DriverFactory.getDriver();

    @Given("I am on login page")
    public void iAmOnLoginPage() {
        driver.get("https://www.asadventure.com/en.html");
        homePage.searchItem("garmin");
    }
}
