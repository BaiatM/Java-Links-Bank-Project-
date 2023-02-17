package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.DriverUtils;

//16b. create verification of HomePage
public class HomePage extends BasePage {
    WebDriver driver = DriverUtils.getDriver();

    @FindBy(xpath = "//li[@class=\"active\"]")
    WebElement welcomeName;
//    // PROFILE AVATAR ELEMENTS******************************
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
    @FindBy(xpath = "//a[contains(text(), \"View Savings\")]")
    WebElement viewSavings;
    @FindBy(xpath = "//a[@id=\"savings-menu\"]")
    WebElement savings;
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
    @FindBy (xpath = "//li[@class='active']")
    WebElement welcomeText;
    @FindBy (xpath = "//*[text()='Checking']")
    WebElement checkingDropDown;
    @FindBy (xpath = "//*[text()='View Checking']")
    WebElement viewCheckingOption;
    @FindBy (xpath = "//*[text()='New Checking']")
    WebElement newCheckingOption;
    @FindBy (id = "savings-menu")
    WebElement savingsDropDown;
    @FindBy (id = "new-savings-menu-item")
    WebElement newSavingsOption;
    @FindBy (id = "view-savings-menu-item")
    WebElement viewSavingsOption;
    @FindBy (xpath ="//*[text()='Deposit']")
    WebElement depositBtn;

    Actions actions = new Actions(DriverUtils.getDriver());

    public void verifyHomePage() {
        Assert.assertTrue(welcomeName.isDisplayed(), "You are not on the homepage; missing \"Welcome\" message");
    }
    public void clickOnAccountBtn(){
        profileDropDown.click();
    }
    public void verifyPage(){
        Assert.assertTrue(welcomeText.isDisplayed(),"Welcome test message is not visible, could be on wrong page");
    }

    public void clickOnCheckingDropDown(){
        checkingDropDown.click();
    }

    public void verifyCheckingOptions(){
        Assert.assertTrue(viewCheckingOption.isDisplayed());
        Assert.assertTrue(newCheckingOption.isDisplayed());
    }

    public void openNewCheckingInNewTab(){
        actions.keyDown(Keys.COMMAND).click(newCheckingOption).keyUp(Keys.COMMAND).build().perform();
    }

    public void userClicksOnSavingsDropDown(){
        Assert.assertTrue(savingsDropDown.isDisplayed());
        savingsDropDown.click();
    }

    public void clickOnNewSavingsOption(){
        newSavingsOption.click();
    }

    public void userClicksOnViewSavingsOption(){
        viewSavingsOption.click();
    }

    public void userClicksOnDepositBtn(){
        depositBtn.click();

    }

    //SAVINGS ACCOUNTS METHODS
    public void openSavingsOptions() {
        savings.click();
    }
    public void viewSavingsAccounts(){
        viewSavings.click();
    }
    public void createNewSavingsAccount(){
        newSavings.click();
    }


}
