package step_definitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.ViewCheckingPage;

public class ViewCheckingSteps {
    ViewCheckingPage viewCheckingPage=new ViewCheckingPage();

    @And("Verify user is on a View Checking Page")
    public void verifyUserIsOnAViewCheckingPage() {
        Assert.assertTrue(viewCheckingPage.confirmationChecking.isDisplayed());
    }
}
