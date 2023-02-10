package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class BasePage {
    WebDriver driver = DriverUtils.getDriver();
    public BasePage(){
        //The page factory class is essentially what makes Page Object Model easy and worthwhile to implement
        //It will essentially dynamically initialize the WebElements on the page
        //The .initElements() method is used to initialize the elements and we need to pass the driver and the object
        //page that we want to initialize the elements on
        PageFactory.initElements(driver,this);
    }
}
