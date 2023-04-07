package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;


public class RStudyMateStudentPage {

    public RStudyMateStudentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/admin/students']")
    public WebElement studentBtn;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public WebElement fullName;

    @FindBy(xpath = "//tbody/tr/td[7]")
    public WebElement threeDts;

    @FindBy(xpath = "(//tr/td/div/button)[1]")
    public WebElement threeDots;

    @FindBy(xpath = "(//tr/td)[2]")
    public WebElement studentName;

    @FindBy(xpath = "//div//button[.='Delete']")
    public WebElement deleteButtonConfirm;

    @FindBy(xpath = "//div/ul/li[.='Delete']")
    public WebElement deleteBtn;


}
