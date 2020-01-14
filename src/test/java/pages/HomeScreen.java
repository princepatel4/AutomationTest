package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseTest;
import utility.GlobalValues;

import java.util.NoSuchElementException;

public class HomeScreen {

    @FindBy(xpath = "//android.widget.View[contains(@text,'No, thanks.')]")
    WebElement textViewClose;

    @FindBy(xpath = "//android.widget.ImageView[@index='0']")
    WebElement imageViewClose;

    public void closeAd(){

        System.out.println(((AndroidDriver) BaseTest.driver).currentActivity());
        try {
            GlobalValues.waitForScreenToLoad(textViewClose, 1);
            textViewClose.click();
        }catch (Exception e){

        }

        try {
            if (imageViewClose.isDisplayed()) {
                imageViewClose.click();
            } else {
                GlobalValues.waitForScreenToLoad(imageViewClose, 1);
                imageViewClose.click();
            }
        }catch (Exception e){

        }
    }
}
