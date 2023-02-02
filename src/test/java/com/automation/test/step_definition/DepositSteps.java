package com.automation.test.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DepositSteps {

    @Given("Deposit Button is Visible on SideBar Under Transactions\\/Transfers Subsection")
    public void deposit_button_is_visible_on_side_bar_under_transactions_transfers_subsection() {
        System.out.println("Deposit Button Visible.");
    }

    @Given("User Clicks Deposit Button")
    public void user_clicks_deposit_button() {
        System.out.println("Click Deposit Button.");
    }

    @Then("Verify User is on Deposit Page")
    public void verify_user_is_on_deposit_page() {
        System.out.println("See Deposit Page.");
    }


    @Given("User Can See Account for Deposit Dropdown and Deposit Amount Fields")
    public void user_can_see_account_for_deposit_dropdown_and_deposit_amount_fields() {
;
        System.out.println("See Account for Deposit Dropdown and Deposit Amount.");
    }

    @Then("User Selects Account for Deposit")
    public void user_selects_account_for_deposit() {
        System.out.println("Select Account from Dropdown.");
    }

    @Then("User Enters Valid\\(Positive) Amount to Deposit in Selected Account")
    public void user_enters_valid_positive_amount_to_deposit_in_selected_account() {
        System.out.println("Enter Valid (Positive) Amount to Deposit.");
    }

    @Then("User Clicks Submit")
    public void user_clicks_submit() {
        System.out.println("Click Submit.");
    }

    @Then("User Clicks Reset to Clear Selections")
    public void user_clicks_reset_to_clear_selections() {
        System.out.println("Click Reset.");
    }
}
