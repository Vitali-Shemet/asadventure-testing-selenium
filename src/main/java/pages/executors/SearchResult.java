package pages.executors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.SearchResultLocators;
import util.DriverFactory;

import java.util.List;

public class SearchResult {
    private SearchResultLocators searchResultLocators;

    public SearchResult() {
        this.searchResultLocators = new SearchResultLocators();
        PageFactory.initElements(DriverFactory.getDriver(), searchResultLocators);
    }

    public WebElement getItemFromSearchList(int itemIndex){
        return searchResultLocators.itemsOnSearchList.get(itemIndex);
    }

    public List<WebElement> getProductNamesOfItems(){
        return searchResultLocators.productNamesOnSearchList;
    }

    public WebElement getProductNameOfSelectedItem(int itemIndex){
        return getProductNamesOfItems().get(itemIndex);
    }
}
