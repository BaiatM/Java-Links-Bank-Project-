package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class ProfileSteps {
    HomePage homePage = new HomePage();
    @When("user clicks on account button")
    public void userClicksOnAccountButton() {
        homePage.clickOnAccountBtn();

    }


    @Then("user can see {string}")
    public void userCanSee(String btn) {


        if (btn.equals("My Profile")){
            Assert.assertTrue(homePage.profile.isDisplayed());
            Assert.assertTrue(homePage.profile.getText().equals(btn));
        } else if (btn.equals("Change Password")) {
            Assert.assertTrue(homePage.changePassword.isDisplayed());
            Assert.assertTrue(homePage.changePassword.getText().equals(btn));
        } else if (btn.equals("Logout")) {
            Assert.assertTrue(homePage.logOut.isDisplayed());
            Assert.assertTrue(homePage.logOut.getText().equals(btn));
        }

    }
}
