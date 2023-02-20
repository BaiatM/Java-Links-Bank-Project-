package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateNewSavingsAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ViewSavingsAccountsPage;

public class SavingsAccountSteps {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ViewSavingsAccountsPage viewSavingsAccountsPage = new ViewSavingsAccountsPage();
    CreateNewSavingsAccountPage createNewSavingsAccountPage = new CreateNewSavingsAccountPage();

    @Given("user clicks on Savings option in left sidebar")
    public void user_clicks_on_savings_option_in_left_sidebar() throws InterruptedException{
        homePage.userClicksOnSavingsDropDown();
        Thread.sleep(1000);
    }
    @And("user clicks on New Savings option under Savings option")
    public void user_clicks_on_new_savings_option_under_savings_option() throws InterruptedException{
        homePage.clickOnNewSavingsOption();
        Thread.sleep(1000);
    }
    @When("verify user is in Create Savings view")
    public void verify_user_is_in_create_savings_view() {
        createNewSavingsAccountPage.verifyCreateSavingsPage();
    }
    @When("user is able to see all savings related labels")
    public void user_is_able_to_see_all_savings_related_labels() {
        createNewSavingsAccountPage.verifyAllRelatedLabelsAndRadios();
    }
    @And("user selects Savings Account type")
    public void user_selects_savings_account_type() {
        createNewSavingsAccountPage.selectSavings();
//        createNewSavingsAccountPage.selectMoneyMarket();
    }
    @And("user selects Account Ownership")
    public void user_selects_account_ownership() {
        createNewSavingsAccountPage.individualAccount();
//        createNewSavingsAccountPage.jointAccount();
    }
    @And("user enters Account Name")
    public void user_enters_account_name() throws InterruptedException {
        createNewSavingsAccountPage.accountName();
        Thread.sleep(1000);
    }
    @And("user enters Initial Deposit amount")
    public void user_enters_initial_deposit_amount() throws InterruptedException{
        createNewSavingsAccountPage.openBalance();
        Thread.sleep(1000);
    }
    @And("user clicks Submit button")
    public void user_clicks_submit_button() {
        createNewSavingsAccountPage.submitNewSavingsInformation();
    }
    @And("user clicks Reset button")
    public void user_clicks_reset_button() {
        createNewSavingsAccountPage.resetNewSavingsInformation();
    }
    @When("verify user sees View Savings view and the newly created Savings account with On Off button set to On")
    public void verify_user_sees_view_savings_view_and_the_newly_created_savings_account_with_on_off_button_set_to_on() {
        viewSavingsAccountsPage.verifyNewSavingsAccountCreated();
    }
    @When("user clicks View Savings option under Savings option")
    public void user_clicks_view_savings_option_under_savings_option() throws InterruptedException{
        homePage.userClicksOnSavingsDropDown();
        homePage.viewSavingsAccounts();
        Thread.sleep(1000);
    }
    @Then("verify new savings account exists")
    public void verify_new_savings_account_exists() {
        viewSavingsAccountsPage.newSavingsAccountCreated();
    }
    @Then("verify create new savings account page is reset")
    public void verify_create_new_savings_account_page_is_reset() {
        createNewSavingsAccountPage.verifyNewSavingsInformationErased();
    }
}
