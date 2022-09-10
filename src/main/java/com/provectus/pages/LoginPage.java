package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class LoginPage extends BasePage {
//    private WebDriver driver;

    private final By byUsername = By.id("username");

    private final By byPassword = By.id("password");

    @FindBy(css="button[type='submit']")
    private WebElement byLoginButton;

    @FindBy(css=".flash.error")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver,this);
    }


    public LoginPage setUsername(String username) {
        WebElement usernameInput = driver.findElement(byUsername);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        WebElement passwordInput = driver.findElement(byPassword);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }

    public SecurePage clickLoginButton() {
        byLoginButton.click();
        return new SecurePage( driver);
    }

    public LoginPage clickLoginWithIncorrectCreds() throws InterruptedException {
        byLoginButton.click();
        return new LoginPage(driver);
    }

    public SecurePage login(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String verifyErrorMessage() {
        return errorMessage.getText();
    }

    public LoginPage logout(){
        byLoginButton.click();
        return new LoginPage(driver);
    }

}
