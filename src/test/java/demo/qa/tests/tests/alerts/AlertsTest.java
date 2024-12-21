package demo.qa.tests.tests.alerts;

import com.demoqa.pages.alerts_frames_windows.AlertsPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        AlertsPage alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlertsMenuItem();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(expectedAlertText,getAlertText(),"\n Actual & Expected Messages Do Not Match \n");
        acceptAlert();  //we need to accept it otherwise we have no longer access to the other elements.
    }

    public void testConfirmationAlert(){

        AlertsPage alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlertsMenuItem();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String expectedConfirmationResult ="You selected Cancel";
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        Assert.assertTrue(actualConfirmationResult.contains(expectedConfirmationResult));
        Assert.assertEquals(actualConfirmationResult,expectedConfirmationResult,"\n You Did Not Select Cancel \n");
    }

    public void testPromptAlert(){
        String alertText = "Selinum in java with Karim";
        AlertsPage alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlertsMenuItem();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String expectedConfirmationResult ="You entered "+alertText;
        String actualConfirmationResult = alertsPage.getPromptAlertResult();
        Assert.assertEquals(actualConfirmationResult,expectedConfirmationResult,"\n Actual & Expected Results Do Not Match \n");
    }


}
