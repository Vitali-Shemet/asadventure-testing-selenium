package util;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver createDriver() {
        WebDriver driver;
        String driverType = "CHROME";

        switch (driverType) {
            case "CHROME":

                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("unkown browser parameter type");
        }

        driver.manage().window().maximize();

        return driver;
    }

    public static void closeDriver() {
        if (getDriver() != null) {
            getDriver().close();
//            getDriver().quit();
        }
    }

    @Before
    public void beforeScenario(){
        driver = createDriver();
    }
}
