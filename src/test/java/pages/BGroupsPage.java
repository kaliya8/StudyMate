package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utulities.Driver;

import java.util.List;

public class BGroupsPage {

    public BGroupsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//div/div/div)[2]/div/div/div/div/div/div/div/div")
    public List<WebElement> groupList;
}
