package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewCheckingAccountsPage extends BasePage{
    @FindBy(xpath = "//a[text()='View Checking']")
    WebElement viewCheckingOption;
    @FindBy(xpath = "//*[@id='page-title']")
    WebElement pageTitle;
    @FindBy (xpath="//*[@class='card bg-flat-color-1 text-light']")
    List<WebElement> listOfCheckingAccounts;
    @FindBy (xpath = "//a[@aria-controls='transactionTable']")
    WebElement transactionsTable;
    @FindBy (xpath = "//*[@aria-describedby='transactionTable_info']")
    WebElement transactionDetails;
    @FindBy (xpath = "//*[@class='card bg-flat-color-1 text-light']//label")
    List<WebElement> listOfCheckingAccountsToggleBtn;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void userClicksOnViewCheckingOption(){
        viewCheckingOption.click();
    }
    public void verifyViewCheckingAccountsPageTitle(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }

    public void userScrollsDownToTransactionsTable(){
        js.executeScript("arguments[0].scrollIntoView();", transactionsTable);
        Assert.assertTrue(transactionsTable.isDisplayed());
    }
    public void userCanSeeTransactionDetails(){
        Assert.assertTrue(transactionDetails.isDisplayed());
        System.out.println(transactionDetails.getText());
    }
    public void userFindsAccountAndActivatesToggleBtn(String accountName){
        for(int i=0;i<listOfCheckingAccounts.size();i++){
            if(listOfCheckingAccounts.get(i).getText().contains(accountName)){
                System.out.println("Account name: "+accountName);
                js.executeScript("arguments[0].scrollIntoView();", listOfCheckingAccounts.get(i));
                listOfCheckingAccountsToggleBtn.get(i).click();
            }
        }
    }
}
