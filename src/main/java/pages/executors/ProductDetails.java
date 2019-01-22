package pages.executors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.ProductDetailsLocators;
import util.DriverFactory;

import java.util.List;

public class ProductDetails {
    private ProductDetailsLocators productDetailsLocators;

    public ProductDetails() {
        this.productDetailsLocators= new ProductDetailsLocators();
        PageFactory.initElements(DriverFactory.getDriver(), productDetailsLocators);
    }

    public WebElement getProductName(){
        return productDetailsLocators.productName;
    }
}
