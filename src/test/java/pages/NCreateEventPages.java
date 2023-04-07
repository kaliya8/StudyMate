package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class NCreateEventPages {

    public NCreateEventPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[2]/div[3]/div/div[1]/div[2]")
    public WebElement scheduleEventBtn;


    @FindBy(id = "startDate")
    public WebElement DataInbox;

    @FindBy(id = "startTime")
    public WebElement startTime;

    @FindBy(id = "endTime" )
    public WebElement endTime;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement nameInbox;

    @FindBy(xpath = "//div[@role='presentation']/div/ul/li")
    public List <WebElement> groupName;

    @FindBy(xpath = "(//div[3]/div/div)[4]")
    public WebElement  chooseGroupBtn;


    @FindBy(xpath = "//button[.='Пн']")
    public WebElement repeatDays;



    @FindBy(name = "endDate")
    public WebElement endDate;


    @FindBy(xpath = "//div[@class='sc-bWOGAC cOCUCK']//div")
    public WebElement color;


    @FindBy(xpath = "(//div/button)[14]")
    public  WebElement publishBtn;


    @FindBy(xpath = "//div[@class='MuiAlert-message css-1xsto0d']")
    public  WebElement message;
















}
