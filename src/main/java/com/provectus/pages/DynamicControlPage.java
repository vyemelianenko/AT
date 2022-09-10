package com.provectus.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DynamicControlPage extends BasePage {
    @FindBy(css = "#checkbox-example button")
    private WebElement addCheckBoxButton;

    @FindBy(css = "#checkbox")
    private WebElement checkbox;

    @FindBy(css = "#checkbox-example #loading")
    private WebElement loader;

    public DynamicControlPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public DynamicControlPage removeCheckButton() {
        addCheckBoxButton.click();
        wait.until(ExpectedConditions.visibilityOf(loader));
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(loader)));
        return this;
    }


    public boolean isCheckBoxDisaplyed() {
        try {
            return checkbox.isDisplayed();
        } catch (NoSuchElementException e)  {
            return false;
        }
    }
}
