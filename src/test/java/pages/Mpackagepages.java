package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class Mpackagepages {

    public static class StudyMateAddStudent {
        public StudyMateAddStudent() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(name = "email")
        public WebElement usernameBox;

        @FindBy(xpath = "//button[2]")
        public WebElement loginButton;

        @FindBy(name = "password")
        public WebElement passwordBox;


        @FindBy(xpath = "//div/nav/a")
        public List<WebElement> students;

        @FindBy(xpath = "(//div/button)[4]")
        public WebElement addstudents;

        @FindBy(name = "name")
        public WebElement firstName;

        @FindBy(name = "lastName")
        public WebElement lastName;

        @FindBy(name = "phoneNumber")
        public WebElement phoneNumber;

        @FindBy(name = "email")
        public WebElement emailAdress;
        @FindBy(id = "mui-component-select-groupId")
        public WebElement group;

        @FindBy(xpath = "//div[@id='menu-groupId']/div[3]")
        public List<WebElement> groupDropDownList;

        @FindBy(id = "mui-component-select-studyFormat")
        public WebElement studyFormat;

        @FindBy(xpath = "(//div/div/ul)[7]")
        public List<WebElement> studyFormatDropdownList;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement addButton;


    }
}
