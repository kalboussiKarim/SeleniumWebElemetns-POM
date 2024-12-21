package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;

public class DatePickerMenuPage extends WidgetsPage {

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");
    private By dayValue ;


    public void clickSelectDate(){
        click(selectDateField);
    }

    public String getDate(){
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month){
        selectByVisibleText(monthDropDown,month);
    }

    public void selectYear(String year){
        selectByVisibleText(yearDropDown,year);
    }

    // must be private !
    private void setDayValue(String day){
        dayValue = By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+day+"']");
    }

    public void selectDay(String day){
        setDayValue(day);
        click(dayValue);
    }

    public boolean isDayInMonth(String day){
        setDayValue(day);
        return find(dayValue).isDisplayed();
    }
}
