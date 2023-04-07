package utulities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Pagination {

    public static int numberOfItems(){
        String resultStr = Driver.getDriver().findElement(By.xpath("(//nav[@aria-label='pagination navigation']/../div/p)[3]")).getText();
        int result = Integer.parseInt(resultStr.substring(16));
        return result;

    }

    public static void requestPagination(int number){
        WebElement pageInput = Driver.getDriver().findElement(By.xpath("(//nav[@aria-label='pagination navigation']/../div)[2]//input"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(pageInput).doubleClick().perform();
        pageInput.sendKeys(number + "" + Keys.ENTER);
    }

    public static String getActualPagination(){
        WebElement pageInput = Driver.getDriver().findElement(By.xpath("(//input)[2]"));
        String inputStr = pageInput.getAttribute("value");
//        int input = Integer.parseInt(inputStr);
        return inputStr;
    }

}
