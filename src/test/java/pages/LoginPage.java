package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigReader;

public class LoginPage extends BasePage {
    //14b. all methods and elements of the Login page will be created here
    @FindBy(xpath = "//div[@class=\"login-logo\"]//img[@src=\"/bank/images/logo.png\"]")
    WebElement loginLogo;

    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "remember-me")
    WebElement rememberMeBtn;

    @FindBy(id = "submit")
    WebElement signInBtn;

    //accessed from SignUpSteps creating LoginPage object loginpage
    //loginPage.signUpHereLink.click();

    @FindBy(xpath = "//div[@class=\"register-link m-t-15 text-center\"]//a")
    WebElement signUpHereLink;
    @FindBy(id = "username")
    WebElement usernameBar;
    @FindBy(id = "password")
    WebElement passwordBar;


    //15. create new method
    public void enterValidUserNamePassword() {
        if (loginLogo.isDisplayed()) {
            userName.sendKeys("test1@gmail.com");
            password.sendKeys("TestPass1234");
        }
    }

    public void clickSignInButton() {
        signInBtn.click();
    }

    public void clickSignUpHereLink() {
        signUpHereLink.click();
    }
    //16a. the next step is to verify that we are on the HomePage, and this requires creating a new class
    //called HomePage

    public void enterValidLoginInfo(String str1, String str2) {
        usernameBar.sendKeys(ConfigReader.getProperty(str1));
        passwordBar.sendKeys(ConfigReader.getProperty(str2));
    }
}
