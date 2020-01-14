package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalValues {

    public static void waitForScreenToLoad(WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(BaseTest.driver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
}
