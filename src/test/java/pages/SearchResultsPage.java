package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchResultsPage extends BasePage{
    @FindBy(xpath = "//strong[@class=\"text-white card-title\"]")
    WebElement searchResults;


    public void verifySearchResult(){
        Assert.assertTrue(searchResults.isDisplayed());
    }

}
