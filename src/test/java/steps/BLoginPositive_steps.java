package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BLoginPage;
import utulities.Config;
import utulities.Driver;
import utulities.Flow;

public class BLoginPositive_steps {
    BLoginPage lp = new BLoginPage();

    @Given("User is on Studymate Web application")
    public void user_is_on_studymate_web_application() {
        //MyLogger.info("Entering Studymate Web Application");
        Driver.getDriver().get(Config.getValue("studyMateUrl"));

    }

    @When("User enters valid credentials {string} and {string} and clicks login")
    public void user_enters_valid_credentials_and_and_clicks_login(String username, String password) {
        //MyLogger.warn("Logging in Studymate Admin Profile");
        lp.login(username, password);
        Flow.wait(2000);

    }

    @Then("User should successfully login to application")
    public void user_should_successfully_login_to_application() {
        String actualURLAfterAdminLogin = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("Login FAILED",actualURLAfterAdminLogin.contains(Config.getValue("expectedURLAfterAdminLogin")));

    }
}
