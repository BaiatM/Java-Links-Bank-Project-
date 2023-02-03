package com.automation.test.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps extends BaseSteps {
    public WebDriver driver = getDriver();

    @Given("get to the login page")
    public void get_to_the_login_page() {
        //createDigBank() in BaseSteps does this
    }


    //    @Given("enter a valid username <test1@gmail.com>")
    @Test
    public void enter_a_valid_username() {
        createDriver("http://18.116.88.132:8080/bank/login");
        WebDriver driver = getDriver();
        WebElement userName = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        userName.sendKeys("test1@gmail.com");

        enter_a_valid_password("TestPass1234");

    }

    @When("enter a valid password <TestPass1234>")
    public void enter_a_valid_password(String password) {
        WebDriver driver = getDriver();
        WebElement passWord = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        passWord.sendKeys(password);

        click_the_sign_in_button();
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        WebDriver driver = getDriver();
        WebElement signinBtn = driver.findElement(By.id("submit"));
        signinBtn.click();

        verify_the_user_is_on_homepage();
    }

    @When("verify the user is on homepage")
    public void verify_the_user_is_on_homepage() {
        WebDriver driver = getDriver();
        WebElement userNameDisplayed = driver.findElement(By.xpath("//li[@class=\"active\"]"));
        Assert.assertTrue(userNameDisplayed.isDisplayed());

        if(userNameDisplayed.isDisplayed()){
            System.out.println("User Name Displayed.");
            System.out.println("User is on Home Page.");
        }

    }

    @Then("verify the welcome message is displayed on homepage")
    public void verify_the_welcome_message_is_displayed_on_homepage() {


    }

//    @Before
//    public void createDigBank(){
//        createDriver("http://18.116.88.132:8080/bank/login");
//    }
//    @After
//    public void cleanUp(){
//        quitDriver();
//    }
}
