package actions;

import org.openqa.selenium.WebElement;
import pages.executors.ProductDetails;
import pages.executors.SearchResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDetailsAction {
    ProductDetails productDetails = new ProductDetails();

    public String getProductName(){
        return productDetails.getProductName().getText();
    }

}
