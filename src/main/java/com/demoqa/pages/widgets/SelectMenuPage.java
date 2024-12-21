package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage{

    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String text){
        scrollToElementJS(standardMultiSelect);
        //Select select = new Select(find(standardMultiSelect));
        //select.selectByVisibleText(text);
        // both previous lines were replaced by the following utility :
        selectByVisibleText(standardMultiSelect,text);
    }

    // overloading method
    public void selectStandardMulti(int index){
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect,index);
    }

    public void deselectStandardMulti(String value){
        scrollToElementJS(standardMultiSelect);
        deSelectByValue(standardMultiSelect,value);
    }

    public List<String> getAllSelectedStandardMultiOptions(){
        return getAllSelectedOptions(standardMultiSelect);
    }


}
