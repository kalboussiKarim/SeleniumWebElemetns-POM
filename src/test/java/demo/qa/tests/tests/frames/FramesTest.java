package demo.qa.tests.tests.frames;

import com.demoqa.pages.alerts_frames_windows.FramesPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FramesTest extends BaseTest {


    public void testFramesBigBox(){
        FramesPage framesPage = homePage.goToAlertsFramesWindowsCard().clickFramesMenuItem();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText,expectedBigBoxText,"\n Actual & Expected Text Do Not Match\n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,"\n Actual & Expected Header Text Do Not Match \n");
    }

    public void testFramesSmallBox(){
        FramesPage framesPage = homePage.goToAlertsFramesWindowsCard().clickFramesMenuItem();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,"\n Actual & Expected Text Do Not Match\n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,"\n Actual & Expected Header Text Do Not Match \n");
    }
}
