import Utilites.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

public class TestBase {

    public static WebDriver driver ;
    @Parameters ("browser")
    @BeforeTest
    public  void setup ()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterTest

    public void Close () {

        driver.quit();
    }

    @AfterMethod   // To Take ScreenShot
    public void ScreenShotOnFailure (ITestResult result) throws IOException {
        if (result.getStatus()==ITestResult.FAILURE)
        {
            System.out.println("Failed!");
            System.out.println("Taking ScreenShot .... ");
            Helper.CaptureScreenShoot(driver,result.getName(),"ScreenShots/Failed");
        } else if (result.getStatus()==ITestResult.SUCCESS) {

            System.out.println("Pass");
            Helper.CaptureScreenShoot(driver,result.getName(),"ScreenShots/Pass");

        }
        else {
            System.out.println("Blocked");
        }
    }



}
