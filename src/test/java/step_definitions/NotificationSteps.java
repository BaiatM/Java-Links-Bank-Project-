package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utils.DriverUtils;

import java.time.Duration;

public class NotificationSteps {

    HomePage homePage = new HomePage();

    @Given("bell icon has shown a badge number indicating that number of notifications exist")
    public void bell_icon_has_shown_a_badge_number_indicating_that_number_of_notifications_exist() throws InterruptedException{
        homePage.notificationsExist();
        Thread.sleep(5000);
    }
    @And("user clicks bell icon")
    public void user_clicks_bell_icon() throws InterruptedException {
        homePage.clickNotificationBellIcon();
        Thread.sleep(2000);
    }
    @And("user sees dropdown with titles of individual notifications")
    public void user_sees_dropdown_with_titles_of_individual_notifications()  {
        homePage.notificationDropDownPopulated();
    }
    @When("user clicks a notification")
    public void user_clicks_a_notification() throws InterruptedException {
        homePage.clickFirstNotification();
        Thread.sleep(1500);
    }
    @Then("the badge number should decrease by one and user should be taken to a page relevant to the notification")
    public void the_badge_number_should_decrease_by_one_and_user_should_be_taken_to_a_page_relevant_to_the_notification() {
        homePage.notificationsBadgeNumberDecreaseAfterClickOnItem();
    }
}
