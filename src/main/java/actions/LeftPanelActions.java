package actions;

import org.openqa.selenium.Keys;
import pages.executors.LeftPanel;

public class LeftPanelActions {
    private LeftPanel leftPanel = new LeftPanel();

    public void searchItem(String item) {
        leftPanel.searchInput(item).sendKeys(Keys.ENTER);
    }
}
