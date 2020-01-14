package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;
import utility.BaseTest;

public class LandingScreen {




    @BeforeClass
    public void waitForElement(){

    }

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Hindi')]")
    WebElement textViewHindi;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Assamese')]")
    WebElement textViewAssamese;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Done')]")
    WebElement textViewDone;

    String searchAssamese = "Assamese";


    public void uncheckHindi(){


        System.out.println(((AndroidDriver) BaseTest.driver).currentActivity());
        textViewHindi.click();

        BaseTest.driver.findElement(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().text(\""+searchAssamese+"\"));"));
        textViewAssamese.click();
        textViewDone.click();
    }



}
