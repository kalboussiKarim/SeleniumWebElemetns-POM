package demo.qa.tests.tests.forms;

import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.forms.PracticeFormPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton(){
        FormsPage formsPage =  homePage.goToForms();
        PracticeFormPage practiceFormPage = formsPage.clickPracticeFormMenuItem();
        practiceFormPage.checkFemaleRadioButton();
        Assert.assertTrue(practiceFormPage.isFemaleRadioButtonSelected(),"\n Female Radio Button Is Not Selected \n");
    }
}
