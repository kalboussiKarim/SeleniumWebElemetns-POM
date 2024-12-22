package demo.qa.tests.base;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;


import static com.base.BasePage.delay;


public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected String url = "https://demoqa.com/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        Utility.setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterMethod
    public void takeFailedResultScreenShot(ITestResult testResult){
        if(testResult.getStatus() == ITestResult.FAILURE){
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") +
                    "/resources/screenshots/(" +
                    LocalDate.now() +"_"+
                    testResult.getName() + ".png");
            try{
                FileHandler.copy(source,destination);
            }catch (IOException e){
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located At "+ destination);
        }
    }

    @AfterClass
    public void tearDown(){
        //delay(3000);
        driver.quit();
    }
}
