package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RStudyMateLoginPage;
import pages.RStudyMateStudentPage;
import pages.RTrashPage;
import utulities.Config;
import utulities.Driver;
import utulities.Flow;
import utulities.TempStorage;

public class RStudyMateStudentDeletion_steps {

    RStudyMateLoginPage studyMlogin = new RStudyMateLoginPage();
    RStudyMateStudentPage studyMstudent = new RStudyMateStudentPage();

    RTrashPage trashPage = new RTrashPage();


    @Given("user on home page")
    public void user_on_home_page() {
        Driver.getDriver().get(Config.getValue("studyMateUrl"));
        studyMlogin.login("studymate@gmail.com", "123123");
    }

    @Given("user clicks on branch students")
    public void user_clicks_on_branch_students() {
        studyMstudent.studentBtn.click();
        Flow.wait(2000);
        String actualName = studyMstudent.studentName.getText();
        TempStorage.addData("Student", actualName);
        System.out.println(actualName);
    }

    @When("user deletes student")
    public void user_deletes_student() {
        int num = RStudyMateLoginPage.getNumberOfItems();
        System.out.println(num);
        studyMstudent.threeDots.click();
        Flow.wait(2000);
        //studyMstudent.studentName.click();
        studyMstudent.deleteBtn.click();

        studyMstudent.deleteButtonConfirm.click();
        Flow.wait(2000);
        int num1 = RStudyMateLoginPage.getNumberOfItems();
        System.out.println(num1);
    }

    @When("user goes to trash")
    public void user_goes_to_trash() {
        Flow.wait(2000);
        trashPage.trashBtn.click();
        Flow.wait(2000);
        int trashSize = RTrashPage.getNumberOfItems();
        System.out.println(trashSize);
        Actions actions = new Actions(Driver.getDriver());
        Driver.getDriver().navigate().refresh();
        Flow.wait(2000);
        actions.doubleClick(trashPage.pageInput).perform();
        Flow.wait(2000);
        trashPage.pageInput.sendKeys(trashSize + "" + Keys.ENTER);
        Flow.wait(2000);
    }

    @Then("user verifies deleted student")
    public void user_verifies_deleted_student() {
        String actualLastItem = trashPage.trashNameList.get(trashPage.trashNameList.size()-1).getText();
        System.out.println(actualLastItem);
        Assert.assertEquals(TempStorage.getData("Student"),actualLastItem);

    }
}

////*[@id="root"]/div/div[2]/div/div/div/div/div[1]/div/table/tbody/tr[68]/td[1]/p