package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility {

    /*
    ((JavascriptExecutor)driver): This is casting the driver object to JavascriptExecutor.
    The driver in Selenium typically implements the WebDriver interface, but
    JavascriptExecutor is a specific interface for executing JavaScript in the browser.

    Casting here is needed because the driver (e.g., ChromeDriver) implements both WebDriver
    and JavascriptExecutor interfaces. By casting it, we're telling Java to treat driver as
    a JavascriptExecutor so that we can use executeScript.

    .executeScript(jsScript, element): This method executes the provided JavaScript code
    (jsScript) in the context of the current page, with the element being passed as the
    first argument (i.e., arguments[0] in the script).
    */

    public static void scrollToElementJS(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript,element);
    }

    public static void clickJS(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",element);
    }
}
