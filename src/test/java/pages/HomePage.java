package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

//16b. create verification of HomePage
public class HomePage extends BasePage {
    @FindBy(xpath = "//li[@class=\"active\"]")
    WebElement welcomeName;
    // PROFILE AVATAR ELEMENTS******************************
    @FindBy(xpath = "//img[@alt='User Avatar']")
    WebElement profileDropDown;
    @FindBy(xpath = "//*[text()='My Profile']")
   public  WebElement profile;
    @FindBy(xpath = "//*[text()='Change Password']")
   public  WebElement changePassword;
    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logOut;
    // LEFT SIDEBAR ELEMENTS******************************
    @FindBy(xpath = "//a[@class=\"navbar-brand\"]/img")
    WebElement digitalBankIcon;
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li/a/i[@class=\"menu-icon fa fa-home\"]")
    WebElement home;
    // CHECKING ELEMENTS******************************
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[2]/a/i")
    WebElement checking;
    // SAVINGS ELEMENTS******************************
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[3]/a/i")
    WebElement savings;
    @FindBy(xpath = "//a[contains(text(), \"View Savings\")]")
    WebElement viewSavings;
    @FindBy(xpath = "//a[contains(text(), \"New Savings\")]")
    WebElement newSavings;
    // EXTERNAL ELEMENTS******************************
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[4]/a/i")
    WebElement external;
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[5]/a/i")
    WebElement deposit;
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[6]/a/i")
    WebElement withdraw;
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[7]/a/i")
    WebElement transfer;
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[8]/a/i")
    WebElement visaDirectTransfer;

    public void verifyHomePage() {
        Assert.assertTrue(welcomeName.isDisplayed(), "You are not on the homepage; missing \"Welcome\" message");
    }
    public void clickOnAccountBtn(){
        profileDropDown.click();
    }

    //SAVINGS ACCOUNTS METHODS
    public void clickSavings() {
        savings.click();
    }
    public void clickViewSavingsAccounts(){
        viewSavings.click();
    }
    public void clickNewSavingsAccount(){
        newSavings.click();
    }


}
