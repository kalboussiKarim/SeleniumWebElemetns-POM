package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private By textInFrame = By.id("sampleHeading");
    private By headerFramesText = By.xpath("//div[@id='framesWrapper']//h1[text()='Frames']");
    private String iFrameBigBox = "frame1";


    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }

    private void switchToBigBox(){
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox(){
        switchToFrameIndex(2);
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        //System.out.println("Big Frame Text :"+ bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        //System.out.println("Small Frame Text :"+ smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
