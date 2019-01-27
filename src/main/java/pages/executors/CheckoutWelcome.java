package pages.executors;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.CheckoutWelcomeLocators;
import util.DriverFactory;
import util.Helpers;

public class CheckoutWelcome {
    private CheckoutWelcomeLocators checkoutWelcomeLocators;

    public CheckoutWelcome() {
        this.checkoutWelcomeLocators = new CheckoutWelcomeLocators();
        PageFactory.initElements(DriverFactory.getDriver(), checkoutWelcomeLocators);
    }

    public Boolean isOn() {
        return Helpers.isElementDisplayed(checkoutWelcomeLocators.welcomeTitle);
    }

    public BuySteps login(String username, String password) {
        checkoutWelcomeLocators.email.sendKeys(username);
        checkoutWelcomeLocators.continueToCheckoutBtn.click();

        DriverFactory.wait.until(ExpectedConditions.visibilityOf(checkoutWelcomeLocators.loginCheckbox));
        checkoutWelcomeLocators.loginCheckbox.click();
        checkoutWelcomeLocators.password.sendKeys(password);
        checkoutWelcomeLocators.continueToCheckoutBtn.click();

        return new BuySteps();
    }
}
