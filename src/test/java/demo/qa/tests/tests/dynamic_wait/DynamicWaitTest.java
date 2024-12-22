package demo.qa.tests.tests.dynamic_wait;

import com.demoqa.pages.elements.DynamicPropertiesPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicWaitTest extends BaseTest {

    @Test
    public void testVisibleAfterButtonText(){
        DynamicPropertiesPage dynamicPropertiesPage = homePage.goToElements().clickDynamicPropertiesMenuItem();
        String actualText = dynamicPropertiesPage.getVisibleAfterButtonText();
        String expectedText ="Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText,"\n Actual & Expected Text Do Not Match \n");
    }
}
