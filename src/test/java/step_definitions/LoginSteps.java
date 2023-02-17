package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("User enters {string} and {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        loginPage.enterValidLoginInfo(username, password);
    }

    @When("User clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickSubmitBtn();
    }

    @Then("Verify user successfully logged in into account")
    public void verify_user_successfully_logged_in_into_account() {
        homePage.iconBtnVisible();
    }


}
