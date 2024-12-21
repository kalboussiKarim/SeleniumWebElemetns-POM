package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.alerts_frames_windows.Alerts_Frames_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[ text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[ text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[ text()='Widgets']");
    private By alertsFrameWindowCard = By.xpath("//div[@id='app']//h5[ text()='Alerts, Frame & Windows']");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        //delay(2000); // To be able to see execution
        return new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        //delay(2000); // To be able to see execution
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public Alerts_Frames_WindowsPage goToAlertsFramesWindowsCard(){
        scrollToElementJS(alertsFrameWindowCard);
        click(alertsFrameWindowCard);
        return new Alerts_Frames_WindowsPage();
    }



}
