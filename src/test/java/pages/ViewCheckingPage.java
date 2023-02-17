package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCheckingPage extends BasePage{
    @FindBy(xpath = "//span[contains(text(),'Confirmation')]")
    public WebElement confirmationChecking;
}
