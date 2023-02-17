package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverUtilities;

public class BasePage {
    public WebDriver driver= DriverUtilities.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
