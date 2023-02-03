package com.automation.test.step_definition;

import com.automation.test.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import org.junit.Test;
import org.testng.annotations.AfterTest;

public class BaseSteps extends DriverUtils {

    @Before
    public void createDigBank(){
        createDriver("http://18.116.88.132:8080/bank/login");
    }
    @After
    public void cleanUp(){
        quitDriver();
        System.out.println("in cleanUp() method");
    }
}
