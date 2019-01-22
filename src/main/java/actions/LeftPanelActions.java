package actions;

import org.openqa.selenium.Keys;
import pages.executors.LeftPanel;
import pages.executors.SearchResult;

public class LeftPanelActions {
    LeftPanel leftPanel = new LeftPanel();
    SearchResult searchResult = new SearchResult();

    public void searchItem(String item) {
        leftPanel.searchInput(item).sendKeys(Keys.ENTER);
    }
}
