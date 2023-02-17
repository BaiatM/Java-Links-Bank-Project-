package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.ViewSavingsAccountsPage;

public class ViewSavingsAccountsSteps {
    HomePage homePage = new HomePage();
    ViewSavingsAccountsPage viewSavingsAccountsPage = new ViewSavingsAccountsPage();
    @Given("user clicks Savings on left sidebar")
    public void user_clicks_savings_on_left_sidebar() {
        homePage.openSavingsOptions();
    }
    @And("user clicks View Savings option")
    public void user_clicks_view_savings_option() {
        homePage.viewSavingsAccounts();
    }
    @Then("user sees all Savings accounts that exist")
    public void user_sees_all_savings_accounts_that_exist() {
        viewSavingsAccountsPage.verifyViewSavingsAccountsPage();
    }
}
