package utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import static utils.WaitUtil.waitTillVisible;

public class ClickUtil {
    public static void click(WebDriver driver, WebElement element) {
        waitTillVisible(driver,element);

        element.click();
    }
    public static void mouseClick(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    
    public static void clickJS(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }
}

