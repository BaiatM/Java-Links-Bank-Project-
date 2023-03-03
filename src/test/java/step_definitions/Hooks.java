package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.DatabaseUtils;
import utils.DriverUtils;

public class Hooks {
    @Before
    public void setUp(){
        ConfigReader.initializeProperties();
        DriverUtils.createDriver();
    }
    @After
    public void cleanUp(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            scenario.attach(CommonMethods.takeScreenshot(),"image/png",scenario.getName());
        }
        CommonMethods.takeScreenshot(scenario);
        Thread.sleep(3000);
        DriverUtils.getDriver().quit();
    }
    @Before("@DB")
    public void setUpDB(){
        DatabaseUtils.initializeDBProperties();
    }
    @After("@DB")
    public void cleanUpDB(){
        DatabaseUtils.closeDataBaseConnection();
    }
}
