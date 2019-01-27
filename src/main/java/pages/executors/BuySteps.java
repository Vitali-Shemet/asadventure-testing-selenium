package pages.executors;

import org.openqa.selenium.support.PageFactory;
import pages.locators.BuyStepsLocators;
import util.DriverFactory;
import util.Helpers;

public class BuySteps {
    private BuyStepsLocators buyStepsLocators;

    public BuySteps() {
        buyStepsLocators = new BuyStepsLocators();
        PageFactory.initElements(DriverFactory.getDriver(), buyStepsLocators);
    }

    public boolean isOn() {
        return Helpers.isElementDisplayed(buyStepsLocators.progressBar);
    }
}