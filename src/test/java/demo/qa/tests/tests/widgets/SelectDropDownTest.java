package demo.qa.tests.tests.widgets;

import com.demoqa.pages.widgets.SelectMenuPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown(){
        SelectMenuPage selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);
        selectMenuPage.deselectStandardMulti("saab");
        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"),"\n Volvo Is Not Selected As An Option \n");
        Assert.assertTrue(actualSelectedOptions.contains("Opel"),"\n Opel Is Not Selected As An Option \n");
        Assert.assertFalse(actualSelectedOptions.contains("Saab"),"\n Saab Is Selected As An Option \n");
        Assert.assertTrue(actualSelectedOptions.contains("Audi"),"\n Audi Is Not Selected As An Option \n");
    }
}
