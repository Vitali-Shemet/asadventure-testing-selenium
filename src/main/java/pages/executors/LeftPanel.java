package pages.executors;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.LeftPanelLocators;
import util.DriverFactory;
import util.Helpers;

public class LeftPanel {
    private LeftPanelLocators leftPanelLocators;

    public LeftPanel() {
        leftPanelLocators = new LeftPanelLocators();
        PageFactory.initElements(DriverFactory.getDriver(), leftPanelLocators);
    }

    private WebElement searchInput(String item) {
        leftPanelLocators.searchInupt.sendKeys(item);
        return leftPanelLocators.searchInupt;
    }

    public AccountMenu login(String username, String password) {
        leftPanelLocators.accountBtn.click();

        leftPanelLocators.usernameField.sendKeys(username);
        leftPanelLocators.passwordField.sendKeys(password);
        leftPanelLocators.loginBtn.click();

        return new AccountMenu();
    }

    public SearchResult searchItem(String item) {
        searchInput(item).sendKeys(Keys.ENTER);
        return new SearchResult();
    }

    public AccountMenu openAccountMenu() {
        leftPanelLocators.accountBtn.click();
        return new AccountMenu();
    }

    public Basket openBasket() {
        leftPanelLocators.basketMenuBtn.click();
        Helpers.delay(1);
        leftPanelLocators.goToBasketBtn.click();
        return new Basket();
    }

    public void continueShopping() {
        leftPanelLocators.continueShoppingBtn.click();
    }

    public void logout() {
        leftPanelLocators.accountBtn.click();
        Helpers.delay(1);
        leftPanelLocators.logoutBtn.click();
        DriverFactory.wait.until(ExpectedConditions.textToBePresentInElement(leftPanelLocators.accountBtn, "Account"));
    }

    public boolean isUserLoggedIn() {
        return leftPanelLocators.accountBtn.getText().contains("Welcome");
    }
}
