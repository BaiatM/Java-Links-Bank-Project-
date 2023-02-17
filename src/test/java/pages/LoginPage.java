package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage{
    @FindBy(id="username")
    public WebElement usernameInput;

    @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(id="submit")
    public WebElement submitBtn;

    public void enterValidLoginInfo(){
        usernameInput.sendKeys("user01@gmail.com");
        passwordInput.sendKeys("Sdet_2023");
    }

    public void enterValidLoginInfo(String username, String password){
        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));
    }

    public void clickSubmitBtn(){
        submitBtn.click();
    }
}
