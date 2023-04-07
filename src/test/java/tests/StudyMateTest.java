package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KStudyMatePage;
import utulities.Config;
import utulities.Driver;
import utulities.Flow;

import java.util.ArrayList;
import java.util.List;

public class StudyMateTest {
    KStudyMatePage smlp = new KStudyMatePage();
    @Test
    public void positiveLoginTest() {
        Driver.getDriver().get(Config.getValue("studyMateUrl"));
        smlp.emailInputBox.sendKeys(Config.getValue("studyMateAdminLoginEmail"));
        smlp.passwordInputBox.sendKeys(Config.getValue("studyMateAdminLoginPassword"));
        smlp.loginButton.click();
        Flow.wait(500);
        String expectedURL = "https://codewise.studymate.us/admin";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedURL));
    }

    @Test
    public void languageOptions(){
        Driver.getDriver().get(Config.getValue("studyMateUrl"));
        smlp.languageDropdownBtn.click();
        Flow.wait(300);
        List<String> expectedLanguageOptions = new ArrayList<>();
        expectedLanguageOptions.add("Русский");
        expectedLanguageOptions.add("English");


        Assert.assertEquals(2,smlp.languageOptions.size() );

        for (WebElement languageOption:smlp.languageOptions ){
            Assert.assertTrue(expectedLanguageOptions.contains(languageOption.getText()), "language options failed: " + languageOption.getText());
        }
    }

}
