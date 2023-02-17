package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class CreateCheckingPage extends BasePage{

    @FindBy(xpath =" //h1[@id='page-title']")
    public WebElement checkingHeader;
@FindBy(xpath="//input[@id='Standard Checking']")
    public WebElement checkingRadio;
@FindBy(xpath = "//input[@id='Interest Checking']")
    public WebElement interestRadio;
@FindBy(xpath = "//input[@id='Individual']")
public WebElement individualRadio;
@FindBy(xpath = "//input[@id='Joint']")
public WebElement jointRadio;
@FindBy(xpath = "//input[@id='name']")
public WebElement checkingNameField;
@FindBy(xpath = "//input[@id='openingBalance']")
public WebElement checkingInitDep;
@FindBy(xpath ="//button[@id='newCheckingReset']")
public  WebElement checkingReset;
@FindBy(xpath = "//button[@id='newCheckingSubmit']")
public WebElement checkingSubmit;

public void checkingAccountType(String type){
    Assert.assertTrue(checkingRadio.isDisplayed());
    Assert.assertTrue(interestRadio.isDisplayed());
  Assert.assertFalse(checkingRadio.isSelected());
    Assert.assertFalse(interestRadio.isSelected());
    if(type.equals("Standard Checking")){
        System.out.println(checkingRadio.getText());
        checkingRadio.click();
    } else if (type.equals("Interest Checking")) {
        System.out.println(interestRadio.getText());
        interestRadio.click();
    }
}

public void checkingOwnershipType(String type) throws InterruptedException {
    Thread.sleep(2000);
    Assert.assertTrue(individualRadio.isDisplayed());
    Assert.assertTrue(jointRadio.isDisplayed());
    Assert.assertFalse(individualRadio.isSelected());
    Assert.assertFalse(jointRadio.isSelected());

    if(type.equals("Individual")){
        System.out.println(individualRadio.getText());
        individualRadio.click();
    } else if (type.equals("Joint")) {
        System.out.println(jointRadio.getText());
        jointRadio.click();
    }
}

public void checkingAccountName(String name){
    if(name.equals("name")){
        checkingNameField.sendKeys("name");
    } else if (name.equals("name123")) {
        checkingNameField.sendKeys("name123");
    } else if (name.equals("12345566")) {
        checkingNameField.sendKeys("12345566");
    } else if (name.equals("$#%^&&*")) {
        checkingNameField.sendKeys("$#%^&&*");
    }
    System.out.println(checkingNameField.getText());
}
public void initCheckDepo(String amount){
    if(amount.equals("25")){
        checkingInitDep.sendKeys("25");
    } else if (amount.equals("25.0")) {
        checkingInitDep.sendKeys("25.0");
    } else if (amount.equals("25.001")) {
        checkingInitDep.sendKeys("25.001");
    } else if (amount.equals("25.9999")) {
        checkingInitDep.sendKeys("25.9999");
    }
    System.out.println(checkingInitDep.getText());
}

public void resetClick(){
    Assert.assertTrue(checkingReset.isDisplayed());
    checkingReset.click();
}

public void submitClick(){
    String primaryWindow = driver.getWindowHandle();
    Actions action = new Actions(driver);
    action.keyDown(Keys.COMMAND).click(checkingSubmit).keyUp(Keys.COMMAND).build().perform();
    ArrayList<String> windowList = new ArrayList<>(driver.getWindowHandles());
    for (String windowHandle:windowList){
        if(!windowHandle.equals(primaryWindow)){
            driver.switchTo().window(windowHandle);
            if(!driver.getCurrentUrl().contains("bank/account/checking-view")){
                driver.close();
            }
        }
    }
}

}

//#1. Display Checking field under BANKING ACCOUNTS section,
// #clicking on 'Checking' dropdown should be displayed with following options: View Checking, New Checking
// #2. Clicking on 'New Checking' option, should redirect user to "http://3.131.35.165:8080/bank/account/checking-add"
// ###(Note: Click on 'New Checking' and try to open it in new tab) ------
// #3. Display a header "New Checking Account"
// #4. Display a label "Select Checking Account Type" with the following radio button options:
// #  Standard Checking, Interest Checking
// #  - All Radio buttons should be unchecked by default
// #5. Display a label "Select Account Ownership" with the following radio button options: Individual, Joint
// #  - All Radio buttons should be unchecked by default
// #6. Display an Input filed "Account Name".
// #- Accepts alphanumeric and special characters.
// #6. Display an Input filed "Initial Deposit Amount"
// #- Minimum opening deposit is $25.00. Accepts numeric whole or decimal values.
// #7. Display 'Submit' button, clicking on it should successfully create an account
// # and user will be redirected to page to view checking account.
// #8. Display 'Reset' button, clicking on it should reset all filled values to default state.