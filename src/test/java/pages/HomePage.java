package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@id='new-savings-menu-item']")
    public WebElement newSavingsButton;

    @FindBy(xpath = "//a[@id='view-savings-menu-item']")
    public WebElement viewSavings;
    @FindBy(xpath = "//img[@alt='User Avatar']")
    public WebElement iconBtn;
    @FindBy(xpath = "//a[@id='home-menu-item']")
    public WebElement homeBtn;
    @FindBy(xpath = "//a[@id='checking-menu']")
    public WebElement checkingBtn;
    @FindBy(xpath = "//a[@id='savings-menu']")
    public WebElement savingsBtn;
    @FindBy(xpath = "//a[@id='external-accounts-menu']")
    public WebElement externalBtn;
    @FindBy(xpath = "//a[@id='deposit-menu-item']")
    public WebElement depositBtn;
    @FindBy(xpath = "//a[@id='withdraw-menu-item']")
    public WebElement withdrawBtn;
    @FindBy(xpath = "//a[@id='transfer-menu-item']")
    public WebElement transferBetweenAccounts;
    @FindBy(xpath = "//a[@href='/bank/external/xfer-visa']")
    public WebElement visaDirectTransfer;
    @FindBy(xpath = "//a[@id='view-checking-menu-item']")
    public WebElement viewChecking;
    @FindBy(xpath = "//a[@id='new-checking-menu-item']")
    public WebElement newChecking;

    public void iconBtnVisible() {
        Assert.assertTrue(iconBtn.isDisplayed());
    }

    public void checkingDropDown() {
        checkingBtn.click();
    }

    public void newCheckingClick() {
        String primaryWindow = driver.getWindowHandle();
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).click(newChecking).keyUp(Keys.COMMAND).build().perform();
        ArrayList<String> windowList = new ArrayList<>(driver.getWindowHandles());
        for (String windowHandle : windowList) {
            if (!windowHandle.equals(primaryWindow)) {
                driver.switchTo().window(windowHandle);
                if (!driver.getCurrentUrl().contains("account/checking-add")) {
                    driver.close();
                }
            }
        }
    }


    public void savingDropDown() {
        savingsBtn.click();
    }

    public void newSavingsButton(){
        String primaryWindow = driver.getWindowHandle();
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).click(savingsBtn).keyUp(Keys.COMMAND).build().perform();
        ArrayList<String> windowList = new ArrayList<>(driver.getWindowHandles());
        for (String windowHandle : windowList) {
            if (!windowHandle.equals(primaryWindow)) {
                driver.switchTo().window(windowHandle);
                if (!driver.getCurrentUrl().contains("account/savings-add")) {
                    driver.close();
                }
            }
        }
    }

    public void  clickNewSavings(){
        newSavingsButton.click();
    }

    public void clickViewSavings(){
        String primaryWindow = driver.getWindowHandle();
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).click(viewSavings).keyUp(Keys.COMMAND).build().perform();
        ArrayList<String> windowList = new ArrayList<>(driver.getWindowHandles());
        for (String windowHandle : windowList) {
            if (!windowHandle.equals(primaryWindow)) {
                driver.switchTo().window(windowHandle);
                if (!driver.getCurrentUrl().contains("account/savings-view")) {
                    driver.close();
                }
            }
        }
    }
}