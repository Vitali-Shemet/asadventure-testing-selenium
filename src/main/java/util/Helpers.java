package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helpers {
    public static WebElement scrollTo(WebElement element) {
        element.getLocation();
        WebDriver driver = DriverFactory.getDriver();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        return element;
    }
}
