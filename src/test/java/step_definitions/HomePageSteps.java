package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class HomePageSteps {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Then("User see the {string}")
    public void user_see_the(String button) {
        if (button.equals("Home")) {
            Assert.assertTrue(homePage.homeBtn.isDisplayed());
            Assert.assertTrue(homePage.homeBtn.getText().equals(button));
        } else if (button.equals("Checking")) {
            Assert.assertTrue(homePage.checkingBtn.isDisplayed());
            Assert.assertTrue(homePage.checkingBtn.getText().equals(button));
        } else if (button.equals("Savings")) {
            Assert.assertTrue(homePage.savingsBtn.isDisplayed());
            Assert.assertTrue(homePage.savingsBtn.getText().equals(button));
        } else if (button.equals("External")) {
            Assert.assertTrue(homePage.externalBtn.isDisplayed());
            Assert.assertTrue(homePage.externalBtn.getText().equals(button));
        } else if (button.equals("Deposit")) {
            Assert.assertTrue(homePage.depositBtn.isDisplayed());
            Assert.assertTrue(homePage.depositBtn.getText().equals(button));
        } else if (button.equals("Withdraw")) {
            Assert.assertTrue(homePage.withdrawBtn.isDisplayed());
            Assert.assertTrue(homePage.withdrawBtn.getText().equals(button));
        } else if (button.equals("Transfer Between Accounts")) {
            Assert.assertTrue(homePage.transferBetweenAccounts.isDisplayed());
            Assert.assertTrue(homePage.transferBetweenAccounts.getText().equals(button));
        } else if (button.equals("VISA Direct Transfer")) {
            Assert.assertTrue(homePage.visaDirectTransfer.isDisplayed());
            Assert.assertTrue(homePage.transferBetweenAccounts.getText().equals(button));
        }

    }


    @Then("User clicks on Checking dropdown")
    public void userClicksOnCheckingDropdown() {
        homePage.checkingDropDown();

    }

    @And("User checks the options are displayed")
    public void userChecksTheOptionsAreDisplayed() {
        Assert.assertTrue(homePage.viewChecking.isDisplayed());
        Assert.assertTrue(homePage.newChecking.isDisplayed());
    }

    @And("User clicks on New Checking Account")
    public void userClicksOnNewCheckingAccount() {
        homePage.newCheckingClick();
    }

}
