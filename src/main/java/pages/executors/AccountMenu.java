package pages.executors;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.AccountMenuLocators;
import util.DriverFactory;

public class AccountMenu {
    private AccountMenuLocators accountMenuLocators;

    public AccountMenu() {
        accountMenuLocators = new AccountMenuLocators();
        PageFactory.initElements(DriverFactory.getDriver(), accountMenuLocators);
    }

    public ProfileDetails openProfileDetails() {
        DriverFactory.wait.until(ExpectedConditions.visibilityOf(accountMenuLocators.profileDetails));
        accountMenuLocators.profileDetails.click();

        return new ProfileDetails();
    }
}
