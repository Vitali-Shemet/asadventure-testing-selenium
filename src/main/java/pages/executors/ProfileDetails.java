package pages.executors;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.ProfileDetailsLocators;
import util.DriverFactory;
import util.Helpers;

public class ProfileDetails {

    private ProfileDetailsLocators profileDetailsLocators;

    public ProfileDetails() {
        this.profileDetailsLocators = new ProfileDetailsLocators();
        PageFactory.initElements(DriverFactory.getDriver(), profileDetailsLocators);
    }

    public boolean isOn() {
        return Helpers.isElementDisplayed(profileDetailsLocators.pageTitle);
    }

    public void updatePhoneNumber(String value) {
        profileDetailsLocators.phoneNumber.clear();
        profileDetailsLocators.phoneNumber.sendKeys(value);
    }

    public void saveChanges() {
        profileDetailsLocators.saveBtn.click();
    }

    public String getPhoneNumber() {
        return profileDetailsLocators.phoneNumber.getAttribute("value");
    }

    public boolean isDetailsSavedPopupDisplayed() {
        return Helpers.isElementDisplayed(profileDetailsLocators.detailsSavedPopup);
    }
}
