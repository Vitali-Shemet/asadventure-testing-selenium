package pages.executors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.ProductDetailsLocators;
import util.DriverFactory;

public class ProductDetails {
    private ProductDetailsLocators productDetailsLocators;

    public ProductDetails() {
        this.productDetailsLocators = new ProductDetailsLocators();
        PageFactory.initElements(DriverFactory.getDriver(), productDetailsLocators);
    }

    public String getProductName(){
        return productDetailsLocators.productName.getText();
    }

    public void addToBasket() {
        productDetailsLocators.addToBasketBtn.click();
        closeBasketPopup();
    }

    public void closeBasketPopup() {
        DriverFactory.wait.until(ExpectedConditions.visibilityOf(productDetailsLocators.basketPopup));
        productDetailsLocators.continueShopping.click();
    }
}
