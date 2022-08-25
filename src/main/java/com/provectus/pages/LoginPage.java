package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class LoginPage extends BasePage {
//    private WebDriver driver;

    private final By byUsername = By.id("username");

    private final By byPassword = By.id("password");

    private final By byLoginButton = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
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
        driver.findElement(byLoginButton).click();
        return new SecurePage(driver);
    }

    public LoginPage clickLoginWithIncorrectCreds() {
        driver.findElement(byLoginButton).click();
        return new LoginPage(driver);
    }

    public SecurePage login(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

}
