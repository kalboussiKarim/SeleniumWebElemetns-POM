package demo.qa.tests.tests.widgets;

import com.demoqa.pages.widgets.DatePickerMenuPage;
import demo.qa.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {

    @Test
    public void testSelectingDate(){
        String year = "2000";
        String month = "June";
        String monthValue = "06";
        String day = "25";
        DatePickerMenuPage datePickerMenuPage = homePage.goToWidgets().clickDatePickerMenu();
        datePickerMenuPage.clickSelectDate();
        datePickerMenuPage.selectYear(year);
        datePickerMenuPage.selectMonth(month);
        if(datePickerMenuPage.isDayInMonth(day)){
            datePickerMenuPage.selectDay(day);
        }
        String actualDate = datePickerMenuPage.getDate();
        String expectedDate = monthValue+"/"+day+"/"+year;
        Assert.assertEquals(actualDate,expectedDate,
                 "\nActual & Expected Dates Do Not Match" +
                         "\nActual Date   : " + actualDate +
                         "\nExpected Date : " + expectedDate +"\n"
                );
    }
}
