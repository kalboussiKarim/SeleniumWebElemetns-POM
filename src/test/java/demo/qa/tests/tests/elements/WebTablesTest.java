package demo.qa.tests.tests.elements;


import com.demoqa.pages.elements.WebTablesPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    @Test
    public void testWebTable(){
        String email = "alden@example.com";
        String age = "34";
        WebTablesPage webTablesPage = homePage.goToElements().clickWebElementsMenuItem();
        webTablesPage.setEditButtonEmail(email);
        webTablesPage.clickEditButton();
        webTablesPage.setAgeField(age);
        webTablesPage.clickSubmitButton();
        webTablesPage.setAgeFieldEmail(email);
        String actualAge = webTablesPage.getTableAge();
        Assert.assertEquals(actualAge,age, "\n Actual & Expected Ages Do Not Match \n" );
    }
}
