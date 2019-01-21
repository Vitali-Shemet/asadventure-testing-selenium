package pages.executors;

import org.openqa.selenium.support.PageFactory;
import pages.locators.HomeLocators;
import util.DriverFactory;

public class HomePage {
    private HomeLocators homeLocators;

    public HomePage() {
        homeLocators = new HomeLocators();
        PageFactory.initElements(DriverFactory.getDriver(), homeLocators);
    }

    public void searchItem(String item) {
        homeLocators.searchItems.sendKeys(item);
    }

}
