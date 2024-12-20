package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage{

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");

    public void checkFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox(){
        if(!find(sportsHobbyCheckbox).isSelected()){
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
                    }
    }

    public void clickReadingCheckbox(){
        if(!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicCheckbox(){
        if(!find(musicHobbyCheckbox).isSelected()){
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unclickSportsCheckbox(){
        if(find(sportsHobbyCheckbox).isSelected()){
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void unclickReadingCheckbox(){
        if(find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void unclickMusicCheckbox(){
        if(find(musicHobbyCheckbox).isSelected()){
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public boolean isReadingSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }
}
