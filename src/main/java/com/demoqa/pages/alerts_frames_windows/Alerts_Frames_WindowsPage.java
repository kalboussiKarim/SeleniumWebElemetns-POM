package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");


    public ModalDialogsPage clickModalDialogsMenuItem(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlertsMenuItem(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }

    public FramesPage clickFramesMenuItem(){
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }
}
