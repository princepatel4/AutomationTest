package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LandingScreen;
import utility.BaseTest;

public class LandingScreenTest extends BaseTest {

    @Test(priority = 1)
    public void checkForAssamese(){

        landingScreen = PageFactory.initElements(driver, LandingScreen.class);
        landingScreen.uncheckHindi();

    }
}
