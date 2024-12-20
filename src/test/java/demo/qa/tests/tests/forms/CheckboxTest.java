package demo.qa.tests.tests.forms;

import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.forms.PracticeFormPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {
    @Test
    public void isReadingCheckboxSelected(){
        FormsPage formsPage = homePage.goToForms();
        PracticeFormPage practiceFormPage = formsPage.clickPracticeFormMenuItem();
        practiceFormPage.clickReadingCheckbox();
        practiceFormPage.clickSportsCheckbox();
        practiceFormPage.clickMusicCheckbox();
        practiceFormPage.unclickReadingCheckbox();
        boolean isReadingCheckboxSelected = practiceFormPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected, "\n Reading Checkbox Is Selected\n");
    }



}
