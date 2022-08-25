package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class MainPage extends BasePage{
//    private WebDriver driver;
//
//    private WebDriverWait wait;
//    private Actions actions;
//    private JavascriptExecutor javascriptExecutor;

    public MainPage(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        this.actions = new Actions(driver);
//        this.javascriptExecutor = (JavascriptExecutor) driver;
        super(driver); //виклик родителя конструтора

    }

    public LoginPage goToAuthPage() {
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }

    public void goToDynControls() {
        driver.findElement(By.linkText("Dynamic Controls")).click();
    }
}
