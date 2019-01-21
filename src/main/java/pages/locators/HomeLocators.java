package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeLocators {

    @FindBy(how = How.ID, using = "search")
    public WebElement searchItems;


}
