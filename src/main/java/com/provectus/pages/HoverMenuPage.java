package com.provectus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class HoverMenuPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(),'Secondary Menu ')]")
    private WebElement secondaryMenu;

    @FindBy(xpath = "//*[contains(text(),'Secondary Action')]")
    private WebElement secondaryAction;

    @FindBy(css = ".dropdown-toggle:nth-of-type(1)")
    private WebElement dropDown;

    @FindBy(xpath = "//*[contains(text(),'Secondary action in the menu was clicked successfully!')]")
    private WebElement secondaryActionMessage;

    public HoverMenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HoverMenuPage navigateToSecondaryActionMenu() {
        Actions action = new Actions(driver);

        action.moveToElement(dropDown)
                .pause(Duration.ofSeconds(2))
                .moveToElement(secondaryMenu)
                .pause(Duration.ofSeconds(2))
                .moveToElement(secondaryAction)
                .click()
                .perform();
        return this;
    }

    public String getSecondaryActionMessage() {
        return secondaryActionMessage.getText();
    }
}
