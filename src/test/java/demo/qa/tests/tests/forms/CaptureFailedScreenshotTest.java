package demo.qa.tests.tests.forms;

import com.demoqa.pages.forms.PracticeFormPage;
import demo.qa.tests.base.BaseTest;
import org.testng.annotations.Test;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor(){
        PracticeFormPage practiceFormPage = homePage.goToForms().clickPracticeFormMenuItem();
        practiceFormPage.clickSubmitButton();
    }
}
