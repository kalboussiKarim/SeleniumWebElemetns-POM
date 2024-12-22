package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {

    private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']//span[text()='Progress Bar']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']//span[text()='Slider']");


    // transition method
    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    // transition method
    public DatePickerMenuPage clickDatePickerMenu(){
        scrollToElementJS(datePickerMenuItem);
        click(datePickerMenuItem);
        return new DatePickerMenuPage();
    }

    // transition method
    public ProgressBarMenuPage clickProgressBarMenu(){
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarMenuPage();
    }

    // transition method
    public SliderMenuPage clickSliderMenu(){
        scrollToElementJS(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderMenuPage();
    }

}
