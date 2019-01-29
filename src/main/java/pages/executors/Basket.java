package pages.executors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.BasketPageLocators;
import util.DriverFactory;
import util.Helpers;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    private BasketPageLocators basketPageLocators;

    public Basket() {
        basketPageLocators = new BasketPageLocators();
        PageFactory.initElements(DriverFactory.getDriver(), basketPageLocators);
    }

    public boolean isOn() {
        return Helpers.isElementDisplayed(basketPageLocators.heading);
    }

    public boolean isProductInBasket(String productName) {
        return getProductsInBasket().contains(productName);
    }

    public CheckoutWelcome checkout() {
        basketPageLocators.checkoutBtn.click();
        return new CheckoutWelcome();
    }

    public void remove(String productName) {
        if(isProductInBasket(productName))
        {
            WebElement productSection = getProductSectionByName(productName);
            productSection.findElement(By.cssSelector("a.checkout-basket__remove-product")).click();
            DriverFactory.wait.until(ExpectedConditions.invisibilityOfAllElements(productSection));
        }
    }

    public Boolean isBasketEmpty() {
        return getProductsInBasket().isEmpty();
    }

    private List<String> getProductsInBasket(){
        List<String> productsList = new ArrayList<String>();
        basketPageLocators.productNames.forEach(el -> productsList.add(el.getText()));
        return productsList;
    }

    private WebElement getProductSectionByName(String product){
        List<WebElement> result = basketPageLocators.productSections
                .stream()
                .filter(item -> item.getText().contains(product))
                .collect(Collectors.toList());
        return result.get(0);
    }
}
