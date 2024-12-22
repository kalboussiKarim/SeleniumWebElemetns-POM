package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.GetUtility.getAttribute;
import static utilities.GetUtility.getText;

public class SliderMenuPage extends WidgetsPage{

    private By sliderValue = By.id("sliderValue");
    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");

    public void moveSlider(int x, int y){
        dragAndDropBy(find(slider),x,y);
    }

    public String getSliderValue(){
        return getAttribute(sliderValue,"value");
    }

}
