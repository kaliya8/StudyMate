package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.NCreateEventPages;
import pages.NSideBarPages;
import pages.NStudyMateLoginPage;

import utulities.Config;
import utulities.Driver;
import utulities.Flow;

import java.util.Random;

public class NStudyMateSchedule_steps {
    NStudyMateLoginPage studyMateLoginPage = new NStudyMateLoginPage();
    NSideBarPages sideBarPages = new NSideBarPages();
    NCreateEventPages createEventPages = new NCreateEventPages();
    Faker faker = new Faker();


    @And("I click  on schedule option on a side bar menu")
    public void iClickOnScheduleOptionOnASideBarMenu() {
        sideBarPages.scheduleButton.click();

    }


    @And("user clicks on Create event button")
    public void userClicksOnCreateEventButton() {
        Flow.wait(2000);
     sideBarPages.createEventButton.click();

    }

    @And("user after completing the details for the Event")
    public void userAfterCompletingTheDetailsForTheEvent() {
        Random random = new Random();
        int time = 10 + random.nextInt(14);
     createEventPages.scheduleEventBtn.click();
     createEventPages.DataInbox.sendKeys("13122023");
    createEventPages.startTime.click();
    createEventPages.startTime.sendKeys(time + "" + 15);
    createEventPages.endTime.click();
    createEventPages.endTime.sendKeys(time + "" + 20);
    createEventPages.nameInbox.sendKeys(faker.name().firstName());
    createEventPages.chooseGroupBtn.click();
    createEventPages.groupName.get(0).click();
    createEventPages.repeatDays.click();
    createEventPages.endDate.sendKeys("14122023");
    createEventPages.publishBtn.click();
    Flow.wait(2000);

    }

    @Then("user should be able to schedule Event on Calendar")
    public void userShouldBeAbleToScheduleEventOnCalendar() {
    String expected = "Event successfully saved";
    Assert.assertEquals(expected, createEventPages.message.getText());
        System.out.println(createEventPages.message.getText());




    }


}
