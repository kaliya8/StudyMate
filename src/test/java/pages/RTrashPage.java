package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class RTrashPage {

    public RTrashPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public static int getNumberOfItems() {
        String resultStr = Driver.getDriver().findElement(By.xpath("//p[2]")).getText();
        int result = Integer.parseInt(resultStr.substring(16));
        return result;
    }

    @FindBy(xpath = "(//a/li)[6]")
    public WebElement trashBtn;

    @FindBy(xpath = "(//tbody/tr)[6]/td[1]")
    public WebElement trashName;

    @FindBy(xpath = "(//div/input)[2]")
    public WebElement pageInput;

    @FindBy(xpath = "//tr/td[1]")
    public List<WebElement> trashNameList;
}
