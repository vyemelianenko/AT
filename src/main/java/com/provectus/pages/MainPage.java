package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class MainPage extends BasePage {
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
        super(); //виклик родителя конструтора

    }

    public MainPage() {

    }

    public LoginPage goToAuthPage() {
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }

    public DomPage goToDomPage() {
        driver.findElement(By.linkText("Challenging DOM")).click();
        return new DomPage(driver);
    }

    public HoverIconPage goToHoversPage() {
        driver.findElement(By.linkText("Hovers")).click();
        return new HoverIconPage(driver);
    }

    public DynamicControlPage goToDynamicControlPage() {
        driver.findElement(By.linkText("Dynamic Controls")).click();
        return new DynamicControlPage(driver);
    }

    public DownloadPage goToDownloadPage() {
        driver.findElement(By.linkText("File Download")).click();
        return new DownloadPage();
    }

    public UploadPage goToUploadPage() {
        driver.findElement(By.linkText("File Upload")).click();
        return new UploadPage();
    }
}
