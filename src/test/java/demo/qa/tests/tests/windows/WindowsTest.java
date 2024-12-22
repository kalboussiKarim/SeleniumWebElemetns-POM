package demo.qa.tests.tests.windows;

import com.demoqa.pages.alerts_frames_windows.BrowserWindowsPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindow(){
        BrowserWindowsPage browserWindowsPage = homePage.
                goToAlertsFramesWindowsCard().
                clickBrowserWindowsMenuItem();
        browserWindowsPage.clickNewWindowButton();
        browserWindowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL,expectedURL,"\n Actual & Expected URLs Do Not Match \n");
    }
}
