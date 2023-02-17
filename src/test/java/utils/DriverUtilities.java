package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverUtilities {
    static WebDriver driver;

    public static void createDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        ConfigReader.getConfigProperty("app.browser");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(ConfigReader.getConfigProperty("app.baseurl"));

    }
     public static WebDriver getDriver(){
        return driver;
     }
}
