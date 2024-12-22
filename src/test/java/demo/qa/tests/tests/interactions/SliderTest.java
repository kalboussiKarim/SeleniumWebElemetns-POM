package demo.qa.tests.tests.interactions;

import com.demoqa.pages.widgets.SliderMenuPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void testSlider() {
        int x = 180;
        int y = 0;
        SliderMenuPage sliderMenuPage = homePage.goToWidgets().clickSliderMenu();
        sliderMenuPage.moveSlider(x,y);
        String actualValue = sliderMenuPage.getSliderValue();
        String expectedValue = "85";
        Assert.assertEquals(actualValue,expectedValue,"\n Actual & Expected Value Do Not Match \n");

    }
}
