package com.automation.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverUtils {

    private static WebDriver driver;

    public void createDriver(String url){
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/automation/test/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        //this will cause the browser to open and wait the amount of time specified before looking for the element
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //maximize the window of the current driver/browser session
        driver.manage().window().maximize();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void quitDriver(){
        driver.close();
        driver.quit();
    }
}
