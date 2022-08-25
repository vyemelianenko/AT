package com.provectus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DragAndDropPage extends BasePage {

    @FindBy(xpath = ("//*[@id='draggable']"))
    WebElement dragMeToMyTarget;

    @FindBy(xpath = ("//*[@id='droppable']"))
    WebElement dropMeHere;

    @FindBy (xpath = "//*[@id='droppable']/*[contains(text(),'Dropped!')]")
    WebElement successfullyMessage;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public DragAndDropPage dragTargetToHere(){
        Actions  dragAndDropAction = new Actions(driver);
        dragAndDropAction.dragAndDrop(dragMeToMyTarget,dropMeHere).perform();
        return this;
    }

    public String verifySuccessMessage() {
        return successfullyMessage.getText();
    }

}
