package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class RStudyMateLoginPage {

    public RStudyMateLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "email")
    public WebElement userNameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "(//button)[3]")
    public WebElement loginButton;

    public void login(String email, String password) {
        userNameInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


    public static int getNumberOfItems() {
        String resultStr = Driver.getDriver().findElement(By.xpath("//p[2]")).getText();
        int result = Integer.parseInt(resultStr.substring(16));
        return result;
    }


}
