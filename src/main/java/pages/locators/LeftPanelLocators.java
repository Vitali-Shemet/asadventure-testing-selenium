package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftPanelLocators {

    @FindBy(how = How.ID, using = "search")
    public WebElement searchInupt;


}
