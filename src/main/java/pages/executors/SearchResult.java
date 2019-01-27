package pages.executors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.SearchResultLocators;
import util.DriverFactory;
import util.Helpers;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchResult {
    private SearchResultLocators searchResultLocators;

    public SearchResult() {
        this.searchResultLocators = new SearchResultLocators();
        PageFactory.initElements(DriverFactory.getDriver(), searchResultLocators);
    }

    public WebElement getItemFromSearchList(int itemIndex) {
        return searchResultLocators.itemsOnSearchList.get(itemIndex);
    }

    public WebElement getProductNameOfSelectedItem(int itemIndex) {
        return searchResultLocators.productNamesOnSearchList.get(itemIndex);
    }

    public List<String> getProductNamesOfItems() {
        List<String> itemsList = new ArrayList<>();
        for (WebElement item : searchResultLocators.productNamesOnSearchList) {
            itemsList.add(item.getText());
        }
        return itemsList;
    }

    public void openSpecificProductNameFromSearchResult(String selectedItem) {
        List<WebElement> result = searchResultLocators.productNamesOnSearchList
                .stream()
                .filter(item -> item.getText().equals(selectedItem))
                .collect(Collectors.toList());
        Helpers.scrollTo(result.get(0)).click();
    }
}
