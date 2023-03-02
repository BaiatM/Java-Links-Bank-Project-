package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InternalTransferPage extends BasePage{
    @FindBy(xpath = "//h1[@id='page-title']")
    WebElement pageTitle;
    @FindBy(xpath = "//select[@id='fromAccount']")
    WebElement fromAccountDropDown;
    @FindBy(xpath = "//select[@id='toAccount']")
    WebElement toAccountDropDown;
    @FindBy (css ="#amount")
    WebElement transferAmountBar;
    @FindBy (xpath = "//*[text()=' Submit']")
    WebElement submitBtn;
    @FindBy (xpath="//small[@id='fromAccountBalance']")
    WebElement availableBalance;


    double transferingAmount;
    public void verifyInternalTransferPage(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }

    public void userChoosesFromAccountAndToAccount(String fromAccount,String toAccount){
        new Select(fromAccountDropDown).selectByValue(fromAccount);
        new Select(toAccountDropDown).selectByValue(toAccount);
    }

    public void userEntersTransferAmount(String transferAmount){
        transferAmountBar.sendKeys(transferAmount);
        transferingAmount = Double.parseDouble(transferAmount);
    }

    public void verifyTransferAmountIsLessThanAvailableBalance(){
        double balance = Double.parseDouble(availableBalance.getText().substring(10)); //461.50
        Assert.assertTrue("Insufficient funds for the transfer",balance>transferingAmount);
    }

    public void userClicksSubmitBtn(){
        submitBtn.click();
    }
}
