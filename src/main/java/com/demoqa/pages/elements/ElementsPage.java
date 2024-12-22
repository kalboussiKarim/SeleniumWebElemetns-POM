package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By LinksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");
    private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");


    public WebTablesPage clickWebElementsMenuItem(){
        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinksMenuItem(){
        scrollToElementJS(LinksMenuItem);
        click(LinksMenuItem);
        return new LinksPage();
    }

    public DynamicPropertiesPage clickDynamicPropertiesMenuItem(){
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }
}
