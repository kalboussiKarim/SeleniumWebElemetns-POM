package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage{

    private By informationAlertButton = By.id("alertButton");

    public void clickInformationAlertButton(){
        click(informationAlertButton);
    }
}
