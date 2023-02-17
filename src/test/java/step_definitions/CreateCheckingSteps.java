package step_definitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.CreateCheckingPage;

public class CreateCheckingSteps {

CreateCheckingPage createCheckingPage=new CreateCheckingPage();
    @And("Verify user is on a new page")
    public void verifyUserIsOnANewPage() {
        Assert.assertTrue(createCheckingPage.checkingHeader.isDisplayed());
    }


    @And("User selects the checking account type {string}")
    public void userSelectsTheCheckingAccountType(String type) {

        createCheckingPage.checkingAccountType(type);
    }

    @And("User selects the checking account ownership {string}")
    public void userSelectsTheCheckingAccountOwnership(String type) throws InterruptedException {

        createCheckingPage.checkingOwnershipType(type);
    }

    @And("User enters checking account name {string}")
    public void userEntersCheckingAccountName(String name) {
        createCheckingPage.checkingAccountName(name);
    }

    @And("User enters checking initial deposit {string}")
    public void userEntersCheckingInitialDeposit(String amount) {
        createCheckingPage.initCheckDepo(amount);
    }

    @And("User clicks Reset button")
    public void userClicksResetButton() {


        createCheckingPage.resetClick();


    }

    @And("User clicks on Submit button")
    public void userClicksOnSubmitButton() {
        createCheckingPage.submitClick();
    }

    @And("User verifies all the fields are empty")
    public void userVerifiesAllTheFieldsAreEmpty() {
        Assert.assertFalse(createCheckingPage.checkingRadio.isSelected());
        Assert.assertFalse(createCheckingPage.interestRadio.isSelected());
        Assert.assertFalse(createCheckingPage.individualRadio.isSelected());
        Assert.assertFalse(createCheckingPage.jointRadio.isSelected());
        Assert.assertTrue(createCheckingPage.checkingNameField.getText().isEmpty());
        Assert.assertTrue(createCheckingPage.checkingInitDep.getText().isEmpty());
    }
}