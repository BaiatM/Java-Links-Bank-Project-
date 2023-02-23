package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ConfigReader;
import utils.DriverUtils;

import java.util.List;

//16b. create verification of HomePage
public class HomePage extends BasePage {
    WebDriver driver = DriverUtils.getDriver();
    Faker faker = new Faker();
    WebDriverWait drWait = new WebDriverWait(DriverUtils.getDriver(), 10);

    @FindBy(xpath = "//li[@class=\"active\"]")
    WebElement welcomeName;
    //  PROFILE AVATAR ELEMENTS******************************
    @FindBy(xpath = "//img[@alt='User Avatar']")
    WebElement profileDropDown;
    @FindBy(xpath = "//*[text()='My Profile']")
    public WebElement profile;
    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement changePassword;
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
    @FindBy(css = "#link-external-menu-item")
    WebElement linkExternal;
    @FindBy(css = "#view-external-menu-item")
    WebElement viewExternal;
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[5]/a/i")
    WebElement deposit;
    @FindBy (id="withdraw-menu-item")
    WebElement withdrawOption;
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[7]/a/i")
    WebElement transfer;
    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[8]/a/i")
    WebElement visaDirectTransfer;
    @FindBy(xpath = "//li[@class='active']")
    WebElement welcomeText;
    @FindBy(xpath = "//*[text()='Checking']")
    WebElement checkingDropDown;
    @FindBy(xpath = "//*[text()='View Checking']")
    WebElement viewCheckingOption;
    @FindBy(xpath = "//*[text()='New Checking']")
    WebElement newCheckingOption;
    @FindBy(id = "savings-menu")
    WebElement savingsDropDown;
    @FindBy(id = "new-savings-menu-item")
    WebElement newSavingsOption;
    @FindBy(id = "view-savings-menu-item")
    WebElement viewSavingsOption;
    @FindBy(xpath = "//*[text()='Deposit']")
    WebElement depositBtn;
    // NAVIAGATION BAR ELEMENTS******************************
    //SEARCH ELEMENTS
    @FindBy(css = "button#searchLocations")
    WebElement searchIcon;
    @FindBy(css = "input#zipcode")
    WebElement zipCode;
    @FindBy(xpath = "//button[@class=\"search-close\"]")
    WebElement xCloseButton;
    //NOTIFICATION ELEMENTS
    @FindBy(css = "button#notification")
    WebElement notificationBellIcon;
    @FindBy(xpath = "//button[@id=\"notification\"]/span[@class=\"count bg-danger\"]")
    WebElement notificationBadgeNumber;
    int notifications = 0;
    int updatedNotifications = 0;
    @FindBy(xpath = "//div[@class=\"dropdown-menu show\"]")
    WebElement notificationDropDown;
    //list of notifications to create Array
    @FindBy(xpath = "//div[@class=\"dropdown-menu show\"]/a[@class=\"dropdown-item media\"]/p")
    List<WebElement> notificationItemsList;
    //first notification
    @FindBy(xpath = "//div[@class=\"dropdown-menu show\"]/a[@class=\"dropdown-item media\"]/p")
    WebElement firstNotificationItem;
    //MESSAGE ELEMENTS
    @FindBy(css = "button#message")
    WebElement emailIcon;
    @FindBy(css = "button#message .count")
    WebElement emailIconBadge;
    int emailBadgeNumber = 0;
    String onScreenMessage = "";
    @FindBy(xpath = "//div[@class=\"dropdown-menu show\"]/p")
    WebElement onScreenEmailMessage;
    @FindBy (xpath="//a[text()='Transfer Between Accounts']")
    WebElement transferBetweenAccountsOption;

    Actions actions = new Actions(DriverUtils.getDriver());

    public void verifyHomePage() {
        Assert.assertTrue(welcomeName.isDisplayed(), "You are not on the homepage; missing \"Welcome\" message");
    }

    public void clickOnAccountBtn() {
        profileDropDown.click();
    }

    public void verifyPage() {
        Assert.assertTrue(welcomeText.isDisplayed(), "Welcome test message is not visible, could be on wrong page");
    }

    //CHECKING ACCOUNTS METHODS
    public void clickOnCheckingDropDown() {
        checkingDropDown.click();
    }

    public void verifyCheckingOptions() {
        Assert.assertTrue(viewCheckingOption.isDisplayed());
        Assert.assertTrue(newCheckingOption.isDisplayed());
    }

    public void openNewCheckingInNewTab() {
        actions.keyDown(Keys.COMMAND).click(newCheckingOption).keyUp(Keys.COMMAND).build().perform();
    }

    public void userClicksOnSavingsDropDown() {
        Assert.assertTrue(savingsDropDown.isDisplayed());
        savingsDropDown.click();
    }

    public void clickOnNewSavingsOption() {
        newSavingsOption.click();
    }

    public void userClicksOnViewSavingsOption() {
        viewSavingsOption.click();
    }

    public void userClicksOnDepositBtn() {
        depositBtn.click();

    }

    //SAVINGS ACCOUNTS METHODS
    public void openSavingsOptions() {
        savings.click();
    }

    public void viewSavingsAccounts() {
        viewSavings.click();
    }

    public void createNewSavingsAccount() {
        newSavings.click();
    }

    //EXTERNAL ACCOUNTS METHODS
    public void clickExternalDropDown() {
        external.click();
    }
    public void clickLinkExternal(){
        linkExternal.click();
    }
    public void clickViewExternal(){
        viewExternal.click();
    }

    //NAVBAR METHODS###################

    //*****SEARCH METHODS
    public void searchATMs() {
        searchIcon.click();
    }

    public void enterZip() {
        String zip = faker.address().zipCode();
        zipCode.sendKeys(zip);
    }

    public void enterInvalidZip() {
        zipCode.sendKeys(ConfigReader.getProperty("invalid.shortZipcode"));
    }

    public void enterKey() {
        actions.sendKeys(Keys.RETURN).perform();
    }

    public void invalidZipInputError() {
        System.out.println("User gets error pop-up");
    }

    public void closeSearchBar() {
        xCloseButton.click();
    }

    //*****NOTIFICATION METHODS
    public int notificationsExist() {
        Assert.assertTrue(notificationBadgeNumber.isDisplayed());
        System.out.println(notificationBadgeNumber.getText());
        notifications = Integer.parseInt(notificationBadgeNumber.getText());
        return notifications;
    }

    public void clickNotificationBellIcon() {
        notificationBellIcon.click();
    }

    public void notificationDropDownPopulated() {
        Assert.assertTrue(notificationDropDown.isDisplayed());
    }

    public void clickFirstNotification() {
        firstNotificationItem.click();
    }

    public void notificationsBadgeNumberDecreaseAfterClickOnItem() {
        notifications = notificationsExist();
        notifications = notifications - 1;
        updatedNotifications = Integer.parseInt(notificationBadgeNumber.getText());
        System.out.println("Updated Notifications: " + updatedNotifications);
        System.out.println("Notifications: " + notifications);
        Assert.assertTrue(notifications == updatedNotifications, "Notification number and updated notification number do no match");
    }
    //*****EMAIL METHODS
        public void clickMessageIcon() {
        emailIcon.click();
        }
        public void messageIconDisplaysBadgeNumber() {
            Assert.assertTrue(emailIconBadge.isDisplayed());
        }
        public void compareMessageBadgeNumberWithOnScreenNumber() {
            emailBadgeNumber = Integer.parseInt(emailIconBadge.getText());
            String badgeNo = Integer.toString(emailBadgeNumber);
            String confirmEmailOnscreen = "You have " + badgeNo + " Unread Mail[s]";
            onScreenMessage = onScreenEmailMessage.getText();
            Assert.assertTrue(onScreenMessage.equalsIgnoreCase(confirmEmailOnscreen), "Message Icon Badge number displayed does not match the On-Screen Message's number of Unread Messages.");
        }

    public void userClicksOnWithdrawOption(){
        withdrawOption.click();
    }

    public void userClicksOnTransferBetweenAccountsOption(){
        transferBetweenAccountsOption.click();
    }


}
