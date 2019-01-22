package actions;

import org.openqa.selenium.WebElement;
import pages.executors.SearchResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchResultAction {
    SearchResult searchResult = new SearchResult();

    public List<String> getProductNamesOfItems() {
        List<String> itemsList = new ArrayList<>();
        for (WebElement item : searchResult.getProductNamesOfItems()) {
            itemsList.add(item.getText());
        }
        return itemsList;
    }

    public void openSpecificProductNameFromSearchResult(String selectedItem) {
        List<WebElement> result = searchResult.getProductNamesOfItems().stream().filter(item -> item.getText().equals(selectedItem)).collect(Collectors.toList());
        result.get(0).click();
    }
}
