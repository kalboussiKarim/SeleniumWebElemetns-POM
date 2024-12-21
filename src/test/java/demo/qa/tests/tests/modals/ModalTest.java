package demo.qa.tests.tests.modals;

import com.demoqa.pages.alerts_frames_windows.ModalDialogsPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog(){
        ModalDialogsPage modalDialogsPage = homePage.
                goToAlertsFramesWindowsCard().
                clickModalDialogsMenuItem();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"),"\n The Message Does Not Contain 'small modal' \n");
        modalDialogsPage.clickCloseSmallModalButton();
    }
}
