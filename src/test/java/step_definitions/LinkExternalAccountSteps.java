package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LinkExternalAccountPage;

public class LinkExternalAccountSteps {
    HomePage homePage = new HomePage();
    LinkExternalAccountPage linkExternalAccountPage = new LinkExternalAccountPage();

    @Given("user has clicked on External option in left sidebar")
    public void user_has_clicked_on_external_option_in_left_sidebar() {
        homePage.clickExternalDropDown();
    }
    @Given("has selected Link External Account option")
    public void has_selected_link_external_account_option() {
        homePage.clickLinkExternal();
    }
    @Given("has confirmed Link External Account page")
    public void has_confirmed_link_external_account_page() {
        linkExternalAccountPage.verifyLinkExternalAccountPage();
    }
    @And("has selected an Open Banking Provider")
    public void has_selected_an_open_banking_provider() {
        linkExternalAccountPage.selectOpenProvider();
    }
    @When("user re-enters valid {string} and {string}")
    public void user_re_enters_valid_and(String str, String str1) {
        linkExternalAccountPage.reEnterUserNameAndPassword(str,str1);
    }

    @When("user clicks on submit button on Link External Account page")
    public void user_clicks_on_submit_button_on_link_external_account_page() {
        linkExternalAccountPage.clickSubmit();
    }
    @Then("user sees new page confirming linked accounts")
    public void user_sees_new_page_confirming_linked_accounts() {
        linkExternalAccountPage.verifyNewPage();
    }
    @When("user sees error message")
    public void user_sees_error_message() {
        linkExternalAccountPage.verifyErrorMessage();
    }
    @When("user clicks Open Banking Provider")
    public void user_clicks_open_banking_provider() {
        linkExternalAccountPage.noOpenBankingProvider();
    }
    @Then("user sees no Open Banking Provider Options are available")
    public void user_sees_no_open_banking_provider_options_are_available() {
        linkExternalAccountPage.noOpenBankingOptions();
    }
    @Then("user sees an error pop-up and no page change")
    public void user_sees_an_error_pop_up_and_no_page_change() {
        linkExternalAccountPage.verifyNoNewPage();
    }
    @When("user clicks on reset button on Link External Account page")
    public void user_clicks_on_reset_button_on_link_external_account_page() {
        linkExternalAccountPage.clickReset();
    }
    @Then("user verifies empty username and password fields")
    public void user_verifies_empty_username_and_password_fields() {
        linkExternalAccountPage.verifyResetInformationFields();
    }
    //View External Accounts steps**************
    @Given("has selected View External Accounts")
    public void has_selected_view_external_accounts() throws InterruptedException {
        homePage.clickViewExternal();
        Thread.sleep(1000);
    }
    @When("user sees pop-up alert there are no External Accounts")
    public void user_sees_pop_up_alert_there_are_no_external_accounts() {
        linkExternalAccountPage.verifyAlertNoExternalAccounts();
    }
    @When("clicks OK on pop-up")
    public void clicks_ok_on_pop_up() {
        linkExternalAccountPage.alertContinueButton();
    }
    @Then("user should be taken to Link External Account page")
    public void user_should_be_taken_to_link_external_account_page()throws InterruptedException {
        linkExternalAccountPage.verifyLinkExternalAccountPage();
        Thread.sleep(1000);
    }
}
