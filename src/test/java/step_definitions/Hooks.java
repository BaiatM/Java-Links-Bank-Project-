package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverUtilities;

public class Hooks {
    @Before
    public void setUp() {
        ConfigReader.initializeProperties();
        DriverUtilities.createDriver();
    }

    @After
    public void tearDown() {
        DriverUtilities.getDriver().quit();
    }
}
