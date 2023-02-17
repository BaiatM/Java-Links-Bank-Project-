package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewSavingsPage extends BasePage {
    Actions action = new Actions(driver);
    @FindBy(xpath = "//h1")
    public WebElement savingsAccountHeader;
    @FindBy(xpath = "//div[@class='card-body']")
    public List<WebElement> accountsList;

    @FindBy(xpath = "//div[@class='card-body']//div[contains(text(),'Practice001')]/..//span[@class='switch-handle']")
    public WebElement onOffToggle;
    @FindBy(xpath = "//*[@id=\"1284\"]/div")
    public WebElement newSavAcc;

    @FindBy(xpath = "//tr[@role='row']")
    public WebElement tableDate;
    @FindBy(xpath = "//tbody//tr[@role='row']")
    public WebElement tableContent;



    public void checkTheInfoMatches(String name) {
        for(WebElement acc:accountsList){
            if(acc.getText().contains(name)){
                System.out.println(acc.getText());
            }
        }

    }

    public void checkSavHeader() {
        Assert.assertTrue(savingsAccountHeader.isDisplayed());
    }

    public void moveToTheSavings() {
        onOffToggle.click();

    }
    public void getTableText(){
        System.out.println(tableDate.getText());
    }
    public void getTableContent(){
        System.out.println(tableContent.getText());
    }
}
