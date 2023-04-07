package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BAdminPage;
import pages.BGroupsPage;
import utulities.Flow;
import utulities.Pagination;
import utulities.TempStorage;

import java.util.Random;

public class BPagination_steps {
    BAdminPage ap = new BAdminPage();
    BGroupsPage gp = new BGroupsPage();

    @When("User clicks on Groups on the sidebar menu")
    public void user_clicks_on_groups_on_the_sidebar_menu() {
        ap.getSidebarOption("Groups").click();
        Flow.wait(2000);

    }


    @Then("User should able to see pagination show of {string} by default")
    public void user_should_able_to_see_pagination_show_of_by_default(String expectedNumber) {
        String actualPagination = Pagination.getActualPagination();
        System.out.println(actualPagination);
//        Pagination.requestPagination(Pagination.numberOfItems());
        Flow.wait(5000);
        Assert.assertEquals(expectedNumber, actualPagination);
    }

    @When("User enters {string} to pagination input box")
    public void user_enters_to_pagination_input_box(String requestedNumber) {
        Random random = new Random();
        int randomNumber = random.nextInt(Pagination.numberOfItems());
        System.out.println(randomNumber);
        TempStorage.addData("Random", randomNumber + "");
        Pagination.requestPagination(randomNumber);
        Flow.wait(2000);

    }
    @Then("User should able to see {string} of wanted items on the page")
    public void user_should_able_to_see_of_wanted_items_on_the_page(String string) {
        int actualNumberOfItems = gp.groupList.size();
        Assert.assertEquals(TempStorage.getData("Random"), actualNumberOfItems + "");
    }


}
