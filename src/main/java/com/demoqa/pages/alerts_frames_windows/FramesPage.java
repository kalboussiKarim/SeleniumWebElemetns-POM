package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private By textInFrame = By.id("sampleHeading");
    private By headerFramesText = By.xpath("//div[@id='framesWrapper']//h1[text()='Frames']");
    private String iFrameBigBox = "frame1";
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']//iframe");


    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }

    private void switchToBigBox(){
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBoxByIndex(){
        switchToFrameIndex(2);
    }

    private void switchToSmallBoxByWebElement(){
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        //System.out.println("Big Frame Text :"+ bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame(){
        switchToSmallBoxByIndex();
        String smallFrameText = find(textInFrame).getText();
        //System.out.println("Small Frame Text :"+ smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }

    public String getTextInSmallFrameElement(){
        switchToSmallBoxByWebElement();
        String smallFrameText = find(textInFrame).getText();
        //System.out.println("Small Frame Text :"+ smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
