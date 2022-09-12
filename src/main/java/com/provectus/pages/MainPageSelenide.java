package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class MainPageSelenide {



    public MainPageSelenide() {
    open("/");
    }

    public DynamicLoadingPageSelenide goToDynamicLoadingPage() {
        $(By.linkText("Dynamic Loading")).click();
        return new DynamicLoadingPageSelenide();
    }

}
