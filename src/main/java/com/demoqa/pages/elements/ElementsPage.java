package com.demoqa.pages.elements;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    public WebTablesPage clickWebElementsMenuItem(){
        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebTablesPage();
    }
}
