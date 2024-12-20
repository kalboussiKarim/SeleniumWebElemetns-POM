package demo.qa.tests.base;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.Utility;

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

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }
}
