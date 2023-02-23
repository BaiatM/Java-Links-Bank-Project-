package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.ConfigReader;
import utils.DriverUtils;

public class LinkExternalAccountPage extends BasePage{
    WebDriver driver = DriverUtils.getDriver();

    @FindBy(css = "h1#page-title")
    WebElement externalAccountTitle;
    @FindBy(xpath = "//span[contains(text(), \"no banking providers available\")]")
    WebElement errorMessage;
    @FindBy(xpath = "//div[@class=\"row\"]/div/div/form/div[1]/div[2]/div/label")
    WebElement openBankingProviders;
    @FindBy(css = "select#bankId")
    WebElement providersDropDown;
    @FindBy(xpath = "//div[@class=\"content mt-3\"]/div/div/div/div/form/div/div[2]/div/select/option")
    WebElement noBankingProviders;
    @FindBy(xpath = "//div[@class=\"row\"]/div/div/form/div[1]/div[3]/div/label")
    WebElement userName;
    @FindBy(xpath = "//input[@id=\"username\"]")
    WebElement userNameInputField;
    @FindBy(xpath = "//div[@class=\"row\"]/div/div/form/div[1]/div[4]/div/label")
    WebElement password;
    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement passWordInputField;
    @FindBy(xpath = "//div[@class=\"card-footer\"]/button[@type=\"submit\"]")
    WebElement submitBtn;
    @FindBy(xpath = "//div[@class=\"card-footer\"]/button[@type=\"reset\"]")
    WebElement resetBtn;



//    public void openProviders(){
//        providersDropDownOptions.selectByVisibleText(ConfigReader.getProperty("invalid.provider"));
//    }

    String primaryWindow = driver.getWindowHandle();

    public void verifyLinkExternalAccountPage() {
        Assert.assertTrue(externalAccountTitle.isDisplayed());
        Assert.assertTrue(openBankingProviders.isDisplayed());
        Assert.assertTrue(providersDropDown.isDisplayed());
        Assert.assertTrue(userName.isDisplayed());
        Assert.assertTrue(userNameInputField.isDisplayed());
        Assert.assertTrue(password.isDisplayed());
        Assert.assertTrue(passWordInputField.isDisplayed());
        Assert.assertTrue(submitBtn.isDisplayed());
        Assert.assertTrue(resetBtn.isDisplayed());
    }
    public void selectOpenProvider() {
        Select providersDropDownOptions = new Select(providersDropDown);
        providersDropDownOptions.selectByVisibleText(ConfigReader.getProperty("invalid.provider"));
    }
    public void noOpenBankingProvider() {
        Select providersDropDownOptions = new Select(providersDropDown);
        providersDropDownOptions.selectByVisibleText(ConfigReader.getProperty("invalid.noprovideroptions"));
    }
    public void noOpenBankingOptions() {
        Assert.assertTrue(noBankingProviders.getText().equals(ConfigReader.getProperty("invalid.noprovideroptions")), "Open Banking Providers exist.");
    }
    public void reEnterUserNameAndPassword(String str1, String str2) {
        userNameInputField.sendKeys(ConfigReader.getProperty(str1));
        passWordInputField.sendKeys(ConfigReader.getProperty(str2));
    }
    public void clickSubmit() {
        submitBtn.click();
    }
    public void clickReset() {
        resetBtn.click();
    }
    public void verifyNewPage(){
        Assert.assertTrue(!driver.getWindowHandle().equals(primaryWindow), "Link External Account information has not been submitted.");
    }
    public void verifyNoNewPage(){
        Assert.assertTrue(driver.getWindowHandle().equals(primaryWindow), "You are on a new page.");
    }
    public void verifyErrorMessage() {
        Assert.assertTrue(errorMessage.isDisplayed());
    }
    public void verifyResetInformationFields(){
        Assert.assertTrue(userNameInputField.getText().isEmpty());
        Assert.assertTrue(passWordInputField.getText().isEmpty());
    }

}
