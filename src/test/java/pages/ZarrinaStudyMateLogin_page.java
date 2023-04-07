package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class ZarrinaStudyMateLogin_page {

    public ZarrinaStudyMateLogin_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginBtn;
}
