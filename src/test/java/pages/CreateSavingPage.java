package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

import java.util.ArrayList;

public class CreateSavingPage extends BasePage{
    @FindBy(xpath = "//a[@id='savings-menu']")
    public WebElement savings;
    @FindBy(xpath = "//a[@id='new-savings-menu-item']")
    public WebElement newSavings;
    @FindBy(xpath = "//h1")
    public WebElement createSavingsHeader;
    @FindBy(xpath = "//input[@id='Savings']")
public WebElement typeSavings;
    @FindBy(xpath = "//input[@id='Money Market']")
    public WebElement typeMoneyMarket;
    @FindBy(xpath = "//input[@id='Individual']")
    public WebElement typeIndividual;
    @FindBy(xpath = "//input[@id='Joint']")
    public WebElement typeJoint;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement accName;
    @FindBy(xpath = "//input[@id='openingBalance']")
    public WebElement initSavDeposit;
    @FindBy(xpath = "//button[@id='newSavingsSubmit']")
    public WebElement submitSavings;
    @FindBy(xpath = "//button[@id='newSavingsReset']")
    public WebElement resetSavings;

public void typeSavingsAccount(){
    typeSavings.click();
}

public void typeOwnershipSavings(){
    typeIndividual.click();
}

public void enterAccountName(String name){
    accName.sendKeys(ConfigReader.getConfigProperty(name));
}

public void enterSavDepos(String amount){
    initSavDeposit.sendKeys(ConfigReader.getConfigProperty(amount));
}
public void clickSavSubmit(){
    String primaryWindow = driver.getWindowHandle();
    Actions action = new Actions(driver);
    action.keyDown(Keys.COMMAND).click(submitSavings).keyUp(Keys.COMMAND).build().perform();
    ArrayList<String> windowList = new ArrayList<>(driver.getWindowHandles());
    for (String windowHandle:windowList){
        if(!windowHandle.equals(primaryWindow)){
            driver.switchTo().window(windowHandle);
            if(!driver.getCurrentUrl().contains("account/savings-view")){
                driver.close();
            }
        }
    }
}

}
