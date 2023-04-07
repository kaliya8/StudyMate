package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utulities.Driver;

public class ZarrinasBlock_page {
    public ZarrinasBlock_page(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//a[.='Students']")
    public WebElement students;

    //@FindBy(xpath = "(//div[.=button])[2]")
    @FindBy(xpath = "(//div[.=button])[2]/button")
    public WebElement threeDots;

    //@FindBy(xpath = "(//ul//li)[2]")
    @FindBy(xpath = "(//li[.='Block'])[1]")
    public WebElement blockBtnOne;

    //@FindBy(xpath = "(//div//button)[12]")
    @FindBy(xpath = "//button[.='Block']")
    public WebElement getBlockBtnTwo;

    //@FindBy(xpath="//p[@class='sc-dmqHEXeojBCV'][1]")
    @FindBy(xpath="//div[@class='MuiAlert-message css-1xsto0d']")
    public WebElement messageVerification;
}