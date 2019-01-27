package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.w3c.dom.html.HTMLInputElement;

public class CheckoutWelcomeLocators {
    @FindBy(how = How.XPATH, using = "//h1[text()='Welcome to the checkout']")
    public WebElement welcomeTitle;

    @FindBy(how = How.CSS, using = "input#email")
    public WebElement email;

    @FindBy(how = How.CSS, using = "button#submit")
    public WebElement continueToCheckoutBtn;

    @FindBy(how = How.XPATH, using = "//label[text()='Yes, I want to login']")
    public WebElement loginCheckbox;

    @FindBy(how = How.CSS, using = "input#password")
    public WebElement password;
}
