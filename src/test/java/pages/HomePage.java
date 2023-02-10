package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

//16b. create verification of HomePage
public class HomePage extends BasePage{
    @FindBy(xpath = "//li[@class=\"active\"]")
    WebElement welcomeName;

    public void verifyHomePage(){
        Assert.assertTrue(welcomeName.isDisplayed(), "You are not on the homepage; missing \"Welcome\" message");
    }
}
