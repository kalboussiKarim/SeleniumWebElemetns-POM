package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.GetUtility.getAttribute;
import static utilities.GetUtility.getText;
import static utilities.WaitUtility.fluentWaitUntilVisible;

public class ProgressBarMenuPage extends WidgetsPage{

    private By progressValue = By.xpath("//div[@id='progressBar']//div[@aria-valuenow='100']");
    private By startButton = By.id("startStopButton");

    public void clickStartButton(){
        click(startButton);
    }

    public String getProgressValue(){
        fluentWaitUntilVisible(30, progressValue);
        return getText(progressValue);
    }




}
