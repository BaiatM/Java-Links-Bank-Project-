package step_definitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.DatabaseUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseValidationSteps {
    @Then("verify user created new account in the database with the {string}")
    public void verifyUserCreatedNewAccountInTheDatabaseWithThe(String newCheckingAccountName) throws SQLException {
        ResultSet rs = DatabaseUtils.executeQuery("SELECT name FROM digitalbank.account where name = '" + newCheckingAccountName + "';");
        rs.next();
        Assert.assertEquals(newCheckingAccountName, rs.getString("name"),"names are not matching");

    }

    @Then("cleanup the database {string}")
    public void cleanupTheDatabase(String newCheckingAccountName){
        DatabaseUtils.deleteQuery("DELETE FROM account WHERE name = '" + newCheckingAccountName + "';");
        // here we supposed to have assertion for deleted account but idk
    }
}
