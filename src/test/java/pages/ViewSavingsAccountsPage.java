package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import utils.DriverUtils;

public class ViewSavingsAccountsPage extends BasePage{
    @FindBy(xpath = "//div[@class=\"page-title\"]/h1[@id=\"page-title\"]")
    WebElement viewSavingsAccountsTitle;

    public void verifyViewSavingsAccountsPage(){
        Assert.assertTrue(viewSavingsAccountsTitle.isDisplayed());
        if(viewSavingsAccountsTitle.isDisplayed()){
            System.out.println("You can view Savings Accounts on this page.");
        }
    }
}
