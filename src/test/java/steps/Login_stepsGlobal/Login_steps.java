package steps.Login_stepsGlobal;

import io.cucumber.java.en.Given;
import pages.AStudyMateLoginPageClass;
import utulities.Config;
import utulities.Driver;

public class Login_steps {

    AStudyMateLoginPageClass aStudyMateLoginPageClass = new AStudyMateLoginPageClass();
    @Given("I am on the login page of StudyMate application")
    public void i_am_on_the_login_page_of_study_mate_application() {
        Driver.getDriver().get(Config.getValue("studyMateUrl"));
    }



    @Given("I login with {string} and {string}")
    public void i_login_with_and(String email, String password) {
        aStudyMateLoginPageClass.login("studymate@gmail.com", "123123");
    }
}
