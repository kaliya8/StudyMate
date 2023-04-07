package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Announcements_page;
import pages.Login_page;
import utulities.Config;
import utulities.Driver;
import utulities.Flow;

    public class Announcements_steps {

       Announcements_page announcementsPage = new Announcements_page();
        Login_page loginPage = new Login_page();

        @Given("user is on studyMate application")
        public void user_is_on_study_mate_application() {
            Driver.getDriver().get(Config.getValue("studyMateURL"));
        }


        @When("user logs in {string} and {string}")
        public void user_logs_in_and(String email, String password) {
            loginPage.emailInput.sendKeys(email);
            Flow.wait(2000);
            loginPage.passwordInput.sendKeys(password);
            Flow.wait(2000);
            loginPage.loginBtn.click();
            Flow.wait(2000);

        }

        @Given("admin click on announcements")
        public void admin_click_on_announcements() {
            Flow.wait(2000);
            announcementsPage.announcements.click();
        }

        @When("admin clicks on group dropdown")
        public void admin_clicks_on_group_dropdown() {
            Flow.wait(2000);
            announcementsPage.groupsSelect.click();
            Flow.wait(2000);
        }
        @When("admin should able to choose one group")
        public void admin_should_able_to_choose_one_group() {
            Flow.wait(2000);
            announcementsPage.group.click();
            Flow.wait(4000);
        }
        @Then("admin should only see the announcements of the selected group")
        public void admin_should_only_see_the_announcements_of_the_selected_group() {
            Flow.wait(2000);
            String expected = announcementsPage.selectedTxt.getText();
            String actualAnnouncementGroupTxt = announcementsPage.selectedGroupText.getText();
            Assert.assertEquals(expected,actualAnnouncementGroupTxt);

        }

    }

