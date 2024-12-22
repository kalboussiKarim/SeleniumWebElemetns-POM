package demo.qa.tests.tests.interactions;

import com.demoqa.pages.elements.TextBoxPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseTest {

    @Test
    public void testKeyboard() {
        TextBoxPage textBoxPage = homePage.goToElements().clickTextBoxMenuItem();
        textBoxPage.setFullNameField("karim kalboussi");
        textBoxPage.setEmailField("kalboussikarim3@gmail.com");
        textBoxPage.setCurrentAdressField("1234 Selenium Avenue");
        textBoxPage.setCurrentAdressField("Rue Orange");
        textBoxPage.setCurrentAdressField("Sousse, Tunisia");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Rue Orange"),"\n Actual Address Does Not Contain Rue Orange \n");
    }
}
