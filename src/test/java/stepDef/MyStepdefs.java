package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.executors.HomePage;
import util.DriverFactory;

public class MyStepdefs {

    HomePage homePage = new HomePage();
    WebDriver driver = DriverFactory.getDriver();

    @Given("I am on home page")
    public void iAmOnHomePage() {
        driver.get("https://www.asadventure.com/en.html");
    }

    @When("I search item {string}")
    public void iSearchItem(String item) {
        homePage.searchItem(item);
    }

    @Then("I see item {string} on asearch list")
    public void iSeeItemOnAsearchList(String item) {
    }
}
