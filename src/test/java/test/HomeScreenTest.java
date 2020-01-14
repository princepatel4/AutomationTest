package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.LandingScreen;
import utility.BaseTest;
import utility.GlobalValues;

public class HomeScreenTest extends BaseTest {



    @Test(priority = 2)
    public void enterFacilitatorNotes(){

        homeScreen = PageFactory.initElements(driver, HomeScreen.class);

        homeScreen.closeAd();

    }
}
