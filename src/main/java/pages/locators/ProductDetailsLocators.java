package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProductDetailsLocators {

    @FindBy(how = How.CSS, using = ".product-detail .a-product-name")
    public WebElement productName;

}
