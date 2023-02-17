package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.*;

public class SavingsSteps {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViewSavingsPage viewSavingsPage = new ViewSavingsPage();
    CreateSavingPage createSavingPage = new CreateSavingPage();
    BasePage basePage = new BasePage();
    Actions action = new Actions(basePage.driver);

    @Then("User clicks on Savings dropdown")
    public void userClicksOnSavingsDropdown() {
        homePage.savingDropDown();

    }

    @Then("User clicks on New Savings button")
    public void user_clicks_on_new_savings_button() {

        homePage.clickNewSavings();
    }

    @Then("User is redirected to new page and sees Create Savings header")
    public void user_is_redirected_to_new_page_and_sees_create_savings_header() throws InterruptedException {
        Assert.assertTrue(createSavingPage.createSavingsHeader.isDisplayed());
    }

    @And("User selects the saving account type")
    public void userSelectsTheSaving() {
        createSavingPage.typeSavingsAccount();

    }

    @And("User selects the account ownership type")
    public void userSelectsTheAccount() {
        createSavingPage.typeOwnershipSavings();

    }

    @And("User enters account name {string}")
    public void userEntersTheSavingsAccountName(String name) {
        createSavingPage.enterAccountName(name);
    }

    @And("User enters initial deposit {string}")
    public void userEntersTheSavings(String amount) {
        createSavingPage.enterSavDepos(amount);

    }

    @And("User clicks the Savings Submit button")
    public void userClicksTheSavingsSubmitButton() {
        createSavingPage.clickSavSubmit();
    }


    @Then("User clicks on View Savings button")
    public void user_clicks_on_view_savings_button() {
        homePage.clickViewSavings();
    }

    @Then("User is redirected to new page and sees View Savings Accounts header")
    public void user_is_redirected_to_new_page_and_sees_view_savings_accounts_header() throws InterruptedException {
        viewSavingsPage.checkSavHeader();
    }

    @Then("User checks the elements of account matches the entered values during submission of {string}")
    public void user_checks_the_information_matches_the_entered_values_during_submission(String name) {
     viewSavingsPage.checkTheInfoMatches(name);


    }


    @Then("User clicks on OnOff toggle of the current account")
    public void user_checks_the_elements_of_the_transactions_table() {
        viewSavingsPage.moveToTheSavings();

    }

    @And("User verifies the elements of transaction table")
    public void userVerifiesTheElementsOfTransactionTable() {
        viewSavingsPage.getTableText();
        viewSavingsPage.getTableContent();

    }

    @Then("User clicks the submit button")
    public void user_clicks_the_submit_button() {
        createSavingPage.submitSavings.click();
    }




}
