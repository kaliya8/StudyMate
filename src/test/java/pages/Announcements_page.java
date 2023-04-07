package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;


    public class Announcements_page {
        public Announcements_page(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//a[.='Announcements']")
        public WebElement announcements;

        @FindBy(xpath = "//div/input[@name='groupId']/../div")
        public WebElement groupsSelect;

        @FindBy(xpath = "//div[@id='menu-groupId']/div[3]/ul/li[.='donnot delete!!']")
        public WebElement group;

        @FindBy(xpath = "//div[@id='mui-component-select-groupId']")
        public WebElement selectedTxt;

        @FindBy(xpath = "(//header)[2]/..//div/span/../div/div[2]")
        public WebElement selectedGroupText;

        @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div[2]")
        public WebElement compareText;




    }
