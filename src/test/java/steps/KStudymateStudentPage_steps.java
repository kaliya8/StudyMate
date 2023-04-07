package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AAssignTeacherPageClass;
import pages.KStudyMatePage;
import utulities.Flow;
import utulities.TempStorage;

public class KStudymateStudentPage_steps {

    KStudyMatePage kstudyMateLoginPage = new KStudyMatePage();
    AAssignTeacherPageClass assignTeacherPageClass = new AAssignTeacherPageClass();




    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        kstudyMateLoginPage.loginButton.click();
        Flow.wait(1000);

    }

    @And("user clicks on Students button")
    public void user_clicks_on_students_button() {
       kstudyMateLoginPage.studentInputButton.click();
    }

    @When("user searches student by {string}")
    public void user_searches_student_by(String name) {
        kstudyMateLoginPage.searchInputBox.click();
        TempStorage.addData("studentName",name);
        System.out.println(name);
        kstudyMateLoginPage.studentName.sendKeys(name);
        kstudyMateLoginPage.searchButton.click();

    }
    @Then("user should see student with this {string}")
    public void user_should_see_student_with_this(String name) {
        String expected = TempStorage.getData("studentName");
        System.out.println(expected);
        Assert.assertEquals(expected,name);

    }



}
