package pages.executors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.LeftPanelLocators;
import util.DriverFactory;

public class LeftPanel {
    private LeftPanelLocators leftPanelLocators;

    public LeftPanel() {
        leftPanelLocators = new LeftPanelLocators();
        PageFactory.initElements(DriverFactory.getDriver(), leftPanelLocators);
    }

    public WebElement searchInput(String item) {
        leftPanelLocators.searchInupt.sendKeys(item);
        return leftPanelLocators.searchInupt;
    }

}
