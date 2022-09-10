package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class SecurePage extends BasePage {
//    private final By byLogoutButton = By.cssSelector("a.button");

    @FindBy(css="a.button")
    private WebElement logoutButton;

    @FindBy(tagName = "h2")
    private WebElement pageTitle;

    @FindBy(css=".flash.success")
    private WebElement alert;
//    private WebDriver driver;

    public SecurePage(WebDriver driver) {
        super();
        PageFactory.initElements(driver,this);
    }

    public LoginPage logout() {
        logoutButton.click();
        return new LoginPage(driver);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public String getAlertText() {
        return alert.getText();
    }

}
