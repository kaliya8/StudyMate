package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ZarrinasBlock_page;
import pages.ZarrinaStudyMateLogin_page;
import utulities.Driver;
import utulities.Flow;

public class ZarrinaBlock_steps {


    ZarrinaStudyMateLogin_page studyMateLoginPage = new ZarrinaStudyMateLogin_page();
    ZarrinasBlock_page studentsBlock_page = new ZarrinasBlock_page();
    @Given("Admin logs on Studymate application")
    public void admin_logs_on_studymate_application() {
        Driver.getDriver().get("https://codewise.studymate.us");
        studyMateLoginPage.emailInput.sendKeys("studymate@gmail.com");
        studyMateLoginPage.passwordInput.sendKeys("123123");
        studyMateLoginPage.loginBtn.click();

        Flow.wait(700);
    }

    @Then("Admin clicks on Students from tag options")
    public void admin_clicks_on_students_from_tag_options() {
        studentsBlock_page.students.click();
        Flow.wait(1000);




    }

    @Then("Admin clicks on three dots")
    public void admin_clicks_on_three_dots() {
        Flow.wait(500);
        studentsBlock_page.threeDots.click();
        Flow.wait(400);


    }


    //    @Then("Admin clicks on three dots from {string}")
//    public void admin_clicks_on_three_dots_from() {
//        studentsBlock_page.threeDots.click();
//    }
    @Then("Admin chooses block option from three dots")
    public void admin_chooses_block_option_from_three_dots() {

        studentsBlock_page.blockBtnOne.click();
        Flow.wait(1000);

    }
    @When("Admin clicks on verify block button")
    public void admin_clicks_on_verify_block_button() {
        studentsBlock_page.getBlockBtnTwo.click();
        Flow.wait(1000);

    }
    @Then("Admin should see a message {string}")
    public void admin_should_see_a_message(String messageV) {
        String message = studentsBlock_page.messageVerification.getText();
        String expected = studentsBlock_page.messageVerification.getText();
        Assert.assertEquals(expected, message);


 }
}