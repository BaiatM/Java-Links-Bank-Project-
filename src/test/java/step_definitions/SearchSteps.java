package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchSteps {
    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Given("user has clicked search icon in top navigation bar")
    public void user_has_clicked_search_icon_in_top_navigation_bar() throws InterruptedException{
        homePage.searchATMs();
        Thread.sleep(1000);
    }
    @And("user has entered a valid zip code to search")
    public void user_has_entered_a_valid_zip_code_to_search() throws InterruptedException{
        homePage.enterZip();
        Thread.sleep(1000);
    }
    @When("user clicks Enter")
    public void user_clicks_enter() {
        homePage.enterKey();
    }
    @Then("user should see ATM Search Location Results page")
    public void user_should_see_atm_search_location_results_page() throws InterruptedException {
        searchResultsPage.verifySearchResult();
        Thread.sleep(1000);}
    @And("user has entered a invalid zip code to search")
    public void user_has_entered_a_invalid_zip_code_to_search() {
        homePage.enterInvalidZip();
    }
    @Then("user should see error pop-up and close search")
    public void user_should_see_error_pop_up_and_close_search() {
        // Write code here that turns the phrase above into concrete actions
        homePage.invalidZipInputError();
    }
}
