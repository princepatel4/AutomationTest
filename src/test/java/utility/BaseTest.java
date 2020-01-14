package utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.HomeScreen;
import pages.LandingScreen;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static AndroidDriver driver;

    public DesiredCapabilities capabilities;

    public LandingScreen landingScreen;
    public HomeScreen homeScreen;

    @BeforeTest
    public void setup() throws MalformedURLException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "app/Saavn Music Radio_v6.0.1_apkpure.com.apk");

        capabilities = new DesiredCapabilities();


        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("app", appDir.getAbsolutePath());
        capabilities.setCapability("noRest", false);

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        capabilities.setCapability("appPackage", "com.saavn.android");

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        GlobalValues.waitForScreenToLoad(driver.findElement(By.className("android.widget.FrameLayout")), 5);


    }


    @AfterSuite
    public void tearDown(){
        //driver.quit();
    }



}
