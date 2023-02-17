package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateNewCheckingAccountPage;
import pages.HomePage;

public class CheckingAccountSteps {
    HomePage homePage = new HomePage();
    CreateNewCheckingAccountPage newTab = new CreateNewCheckingAccountPage();
    @Given("user is clicking on Checking dropdown and seeing following options: View Checking, New Checking")
    public void user_is_clicking_on_checking_dropdown_and_seeing_following_options_view_checking_new_checking() {
        homePage.clickOnCheckingDropDown();
        homePage.verifyCheckingOptions();
    }
    @Given("user is opening new tab by clicking on New Checking option")
    public void user_is_opening_new_tab_by_clicking_on_new_checking_option() {
        homePage.openNewCheckingInNewTab();
    }

    @Given("user is changing to new checking tab")
    public void user_is_changing_to_new_checking_tab() {
        newTab.verifyTheUserIsOnNewTab();
    }

    @Given("user is able to see all related labels")
    public void user_is_able_to_see_all_related_labels() {
        newTab.verifyAllRelatedLabelsAndRadios();
    }

    @When("user fills the information for new checking account")
    public void user_fills_the_information_for_new_checking_account() {
        newTab.userProvidesValidInformation();
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        newTab.clickSubmitBtn();
    }

    @Then("user should see the confirmation message")
    public void user_should_see_the_confirmation_message() {
        newTab.verifyConfirmation();
    }
    @When("user clicks on reset button")
    public void user_clicks_on_reset_button() {
        newTab.clickResetBtn();
    }
    @Then("user should see that information was cleared")
    public void user_should_see_that_information_was_cleared() {
        newTab.verifyEverythingIsBlank();
    }
}