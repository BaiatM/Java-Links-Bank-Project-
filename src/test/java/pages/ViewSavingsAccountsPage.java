package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import utils.ConfigReader;
import utils.DriverUtils;

import java.util.List;


public class ViewSavingsAccountsPage extends BasePage{
    CreateNewSavingsAccountPage createNewSavingsAccountPage = new CreateNewSavingsAccountPage();
//    String nameLastCreatedSavingsAccount = createNewSavingsAccountPage.accountName();

    //##########VIEW SAVINGS ACCOUNT ELEMENTS############
    @FindBy(xpath = "//span[@id=\"new-account-msg\"]")
    WebElement confirmationMessage;

    @FindBy(xpath = "//div[@class=\"page-title\"]/h1[@id=\"page-title\"]")
    WebElement viewSavingsAccountsTitle;

    @FindBy(xpath = "//div[@id=\"firstRow\"]")
    List<WebElement> savingsAccounts;

    //###########VIEW SAVINGS ACCOUNT METHODS#############33
    public void verifyNewSavingsAccountCreated(){
        Assert.assertTrue(confirmationMessage.isDisplayed());
        if(confirmationMessage.isDisplayed()){
            System.out.println("Your new account was created.");
        }
    }
    public void verifyViewSavingsAccountsPage(){
        Assert.assertTrue(viewSavingsAccountsTitle.isDisplayed());
        if(viewSavingsAccountsTitle.isDisplayed()){
            System.out.println("You can view Savings Accounts on this page.");
        }
    }
    public void newSavingsAccountCreated(){
        for(WebElement savingsAccount : savingsAccounts){
            System.out.println(savingsAccount.getText());
            Assert.assertTrue(savingsAccount.getText().contains(ConfigReader.getProperty("savings.name")));
        }
    }
}
