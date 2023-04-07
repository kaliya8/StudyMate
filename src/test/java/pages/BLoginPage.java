package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class BLoginPage {

    public BLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[1]")
    public WebElement cwSingIn1;

    @FindBy(name = "email")
    public WebElement emailInputBox;

    @FindBy(name = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "(//button)[3]")
    public WebElement loginButton;

    @FindBy(id = "mui-component-select-language")
    public WebElement languageDropdown;

    @FindBy(xpath = "//ul/li")
    public List<WebElement> languageOptions;

    @FindBy(linkText = "Sign up with Google")
    public WebElement signUpWithGoogleButton;

    @FindBy(linkText = "Forgot password ?")
    public WebElement forgotPasswordButton;

    public void login(String email, String password){
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }




}
