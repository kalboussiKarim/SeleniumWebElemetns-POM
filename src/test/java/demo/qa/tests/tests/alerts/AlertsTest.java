package demo.qa.tests.tests.alerts;

import com.demoqa.pages.alerts_frames_windows.AlertsPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        AlertsPage alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlertsMenuItem();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(expectedAlertText,getAlertText(),"\n Actual & Expected Messages Do Not Match \n");
        acceptAlert();  //we need to accept it otherwise we have no longer access to the other elements.
    }
}
