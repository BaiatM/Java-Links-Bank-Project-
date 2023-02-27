package utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class CommonMethods {

    public static byte[] takeScreenshot(){
        TakesScreenshot takesScreenshot = (TakesScreenshot) DriverUtils.getDriver();
        byte[] screenShot= takesScreenshot.getScreenshotAs(OutputType.BYTES);
        return screenShot;
    }

    public static void takeScreenshot(Scenario scenario){
        try{
            if(scenario.isFailed()){
                File screenShot = ((TakesScreenshot)DriverUtils.getDriver()).getScreenshotAs(OutputType.FILE);
                try{
                    FileUtils.copyFile(screenShot, new File("target/screenshots/" + scenario.getName() + ".png"));
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }catch(Exception e){
            System.err.println("The error happened while taking screenshot and cleaning up after the test");
            e.printStackTrace();
        }
    }
}
