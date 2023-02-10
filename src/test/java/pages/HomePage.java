package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

//16b. create verification of HomePage
public class HomePage extends BasePage {
    @FindBy(xpath = "//li[@class=\"active\"]")
    WebElement welcomeName;
    @FindBy(xpath = "//img[@alt='User Avatar']")
    WebElement profileDropDown;
    @FindBy(xpath = "//*[text()='My Profile']")
   public  WebElement profile;
    @FindBy(xpath = "//*[text()='Change Password']")
   public  WebElement changePassword;
    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logOut;

    public void verifyHomePage() {
        Assert.assertTrue(welcomeName.isDisplayed(), "You are not on the homepage; missing \"Welcome\" message");
    }
    public void clickOnAccountBtn(){
        profileDropDown.click();
    }



}
