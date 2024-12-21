package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage{

    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.cssSelector(".modal-body");
    private By closeSmallModalButton = By.id("closeSmallModal");

    public void clickSmallModalButton(){
        click(smallModalButton);
    }

    public String getSmallModalText(){
        return find(smallModalText).getText();
    }

    public void clickCloseSmallModalButton(){
        click(closeSmallModalButton);
    }

}
