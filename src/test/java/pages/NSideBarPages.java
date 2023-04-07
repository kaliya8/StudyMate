package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class NSideBarPages {
    public NSideBarPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//nav/a[7]/li")
    public WebElement scheduleButton;


    @FindBy(xpath = "(//div/button)[3]")
    public WebElement createEventButton;
}
