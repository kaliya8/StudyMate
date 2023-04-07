package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Mpackagepages;
import utulities.Driver;

import java.util.Random;

public class MStudymate_steps {

        Faker faker = new Faker();


        Mpackagepages.StudyMateAddStudent studyMateAddStudent = new Mpackagepages.StudyMateAddStudent();

        @Given("user is on studyMate student page")
        public void user_is_on_study_mate_student_page() {
            Driver.getDriver().get("https://codewise.studymate.us/login");
            studyMateAddStudent.usernameBox.sendKeys("studymate@gmail.com");
            studyMateAddStudent.passwordBox.sendKeys("123123");
            studyMateAddStudent.loginButton.click();


        }

        @When("user clicks add student button")
        public void user_clicks_add_student_button() {
            studyMateAddStudent.students.get(3).click();
            studyMateAddStudent.addstudents.click();
        }

        Random random = new Random();

        @When("enters all required credentials")
        public void enters_all_required_credentials() {
            studyMateAddStudent.firstName.sendKeys(faker.name().firstName());
            studyMateAddStudent.lastName.sendKeys(faker.name().lastName());
            studyMateAddStudent.phoneNumber.sendKeys(faker.number().digits(9));
            studyMateAddStudent.emailAdress.sendKeys(faker.internet().emailAddress());
            studyMateAddStudent.group.click();

            studyMateAddStudent.groupDropDownList.get(random.nextInt(studyMateAddStudent.groupDropDownList.size())).click();
            studyMateAddStudent.studyFormat.click();

            studyMateAddStudent.studyFormatDropdownList.get(random.nextInt(studyMateAddStudent.studyFormatDropdownList.size())).click();
            studyMateAddStudent.addButton.click();

        }

        @Then("user need fill the form")
        public void user_need_fill_the_form() {

        }

        @Then("user click add button")
        public void user_click_add_button() {

        }


}
