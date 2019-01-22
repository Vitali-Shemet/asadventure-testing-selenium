package stepDef;

import actions.LeftPanelActions;
import actions.ProductDetailsAction;
import actions.SearchResultAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class MyStepdefs {

    LeftPanelActions homePageAction = new LeftPanelActions();
    SearchResultAction searchResultAction = new SearchResultAction();
    ProductDetailsAction productDetailsAction = new ProductDetailsAction();

    WebDriver driver = DriverFactory.getDriver();

    @Given("I am on home page")
    public void iAmOnHomePage() {
        driver.get("https://www.asadventure.com/en.html");
    }

    @When("I search item {string}")
    public void iSearchItem(String item) {
        homePageAction.searchItem(item);
    }

    @And("I see specific product {string} on search result")
    public void iSeeSpecificProductOnSearchResult(String productName) {
        Assert.assertTrue("Search result is not visible",searchResultAction.getProductNamesOfItems().size()>1);
        Assert.assertTrue("Search result not contains given product: " + productName, searchResultAction.getProductNamesOfItems().contains(productName));
    }

    @And("I open item {string}")
    public void iOpenItem(String item) {
        searchResultAction.openSpecificProductNameFromSearchResult(item);
    }

    @Then("I have found item {string}")
    public void iHaveFoundItem(String productName) {
        Assert.assertEquals(productName, productDetailsAction.getProductName());
    }
}
