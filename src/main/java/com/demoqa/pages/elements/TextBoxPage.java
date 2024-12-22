package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{

    private By fullNameField = By.id("userName");
    private By submitButton = By.id("submit");
    private By currentAdressField = By.xpath("//textarea[@id='currentAddress']");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");



    public void setFullNameField(String name){
        scrollToElementJS(fullNameField);
        //sendKeys() from the WebElement interface will work but we will be using sendKeys() from the Actions class
        //Actions act = new Action(driver);
        //act.sendKeys(find(fullNameField), Keys.chord(name)).perform();
        sendKeys(find(fullNameField),Keys.chord(name));
    }

    public void setEmailField(String email){
        setFullNameField(Keys.chord(Keys.TAB,email));
    }

    public void setCurrentAdressField(String address) {
        find(currentAdressField).sendKeys(address + Keys.ENTER);
    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public String getCurrentAddress(){
        explicitWaitUntilVisible(5,currentAddressResult);
        return getText(currentAddressResult);
    }




}
