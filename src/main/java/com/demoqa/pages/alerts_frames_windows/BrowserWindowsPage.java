package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage{

    private By newTabButton = By.id("tabButton");
    private By newWindowButton = By.id("windowButton");
    private By newWindowMessageButton = By.id("messageWindowButton");

    public void clickNewWindowButton(){
        click(newWindowButton);
    }

    public void switchToNewWindow(){

        // 1: Get The Current "Main" window Handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Windows Id: "+ currentHandle );

        // 2: Get All Window Handles
        Set<String> allHandles =  driver.getWindowHandles();
        System.out.println("Number of Open Windows : "+ allHandles.size());
        for(String handle : allHandles){
            if(currentHandle.equals(handle)){
                System.out.println("1st Window ID: "+handle);
            }else {
                // 3: Switch To The New Window Using The Window Handle
                switchToWindow(handle);
                //driver.switchTo().window(handle);  //replaced by the prev line :D :p
                System.out.println("2nd Window ID: "+handle);
            }
        }
    }
}
