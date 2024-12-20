package demo.qa.tests.tests.javascript;

import demo.qa.tests.base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollingToElement(){
        homePage.goToForms();
    }

}
