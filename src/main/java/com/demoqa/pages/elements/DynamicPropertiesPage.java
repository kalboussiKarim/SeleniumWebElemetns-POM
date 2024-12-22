package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class DynamicPropertiesPage extends ElementsPage{

    private By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText(){
        explicitWaitUntilVisible(5,visibleAfterButton);
        return getText(visibleAfterButton);
    }

}
