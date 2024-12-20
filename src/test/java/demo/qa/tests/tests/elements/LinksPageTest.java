package demo.qa.tests.tests.elements;

import com.demoqa.pages.elements.LinksPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksPageTest extends BaseTest {

    @Test
    public void tesLinks(){
        LinksPage linksPage = homePage.goToElements().clickLinksMenuItem();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"), "\n Actual Response (" + actualResponse + ") \n Does Not Contain '400' and 'Bad Request'");
    }
}
