package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WebTablesPage extends ElementsPage{

    private By editButton;
    private By ageField;
    private By registrationAgeField = By.id("age");
    private By submitButton = By.id("submit");

    public void setEditButtonEmail(String email){
        editButton = By.xpath("//div[text()='"+email+"']//following::span[@title='Edit']");
    }
    //div[text()='alden@example.com']//preceding::div[1]
    public void setAgeFieldEmail(String email){
        ageField = By.xpath("//div[text()='"+email+"']//preceding::div[1]");
    }
    public String getTableAge(){
        return find(ageField).getText();
    }

    public void clickEditButton(){
        click(editButton);
    }

    public void setAgeField(String age){
        set(registrationAgeField,age);
    }

    public void clickSubmitButton(){
        click(submitButton);
    }
}
