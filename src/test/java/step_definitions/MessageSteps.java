package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class MessageSteps {
    HomePage homePage = new HomePage();

    @Given("user has clicked message-email navigation bar icon")
    public void user_has_clicked_message_email_navigation_bar_icon() {
        homePage.clickMessageIcon();
    }
    @And("has seen the number of messages in the icon's badge")
    public void has_seen_the_number_of_messages_in_the_icon_s_badge() {
        homePage.messageIconDisplaysBadgeNumber();
    }
    @Then("user should see on-screen message confirming the number of Unread Messages matches badge number")
    public void user_should_see_on_screen_message_confirming_the_number_of_unread_messages_matches_badge_number() throws InterruptedException {
        homePage.compareMessageBadgeNumberWithOnScreenNumber();
        Thread.sleep(2000);
    }
}
