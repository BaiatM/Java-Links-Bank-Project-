package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverUtils;

public class Hooks {
    @Before
    public void setUp(){
        DriverUtils.createDriver();
    }
    @After
    public void cleanUp() throws InterruptedException {
        Thread.sleep(3000);
        DriverUtils.getDriver().quit();
    }
}
//Use the framework we created to write and implement a sign-up feature DO NOT USE REAL DATA
//Note: Since we can only sign up with a particular set of data once your test may only pass
// the first time it runs. Do not worry this is expected.
