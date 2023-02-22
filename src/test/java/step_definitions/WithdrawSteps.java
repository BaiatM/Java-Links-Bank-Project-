package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ViewCheckingAccountsPage;
import pages.WithdrawPage;

public class WithdrawSteps {
    HomePage homePage = new HomePage();
    WithdrawPage withdrawPage = new WithdrawPage();
    ViewCheckingAccountsPage checkingAccountsPage = new ViewCheckingAccountsPage();
    @Given("user clicked on Withdraw option")
    public void userClickedOnWithdrawOption() {
        homePage.userClicksOnWithdrawOption();
    }

    @And("user is redirected to withdraw page")
    public void userIsRedirectedToWithdrawPage() {
        withdrawPage.verifyWithdrawPage();
    }

    @When("user selects {string} account")
    public void userSelectsAccount(String accountValue) {
        withdrawPage.userSelectsWithdrawAccount(accountValue);
    }

    @And("user should see available balance")
    public void userShouldSeeAvailableBalance() {
        withdrawPage.userCanSeeAvailableBalance();
    }

    @And("user provides {string} and clicks submit button")
    public void userProvidesWithdrawAmountAndClicksSubmitButton(String amount) {
        withdrawPage.userEntersWithdrawAmount(amount);
        withdrawPage.userClicksOnSubmitBtn();
    }

    @And("user is redirected to view checking accounts")
    public void userIsRedirectedToViewCheckingAccounts() {
        checkingAccountsPage.verifyViewCheckingAccountsPageTitle();
    }

    @Then("user verifies {string} and new balance")
    public void userVerifiesTheWithdrawAmountAndNewBalance(String amount) {
        checkingAccountsPage.userVerifiesWithdrawAmountAndNewBalance(amount);
        checkingAccountsPage.userVerifiesNewBalanceInTransactionTable();
    }
}
