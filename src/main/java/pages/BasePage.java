package pages;

import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class BasePage {
    private WebDriver driver;
    public BasePage() {
        WebDriver driver = new DriverFactory().getDriver();
    }
}
