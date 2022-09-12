package com.provectus.pages;

import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DynamicLoadingPageSelenide {


    public DynamicLoadingPageSelenide selenideClicktoExampleLink1() {
        $(By.partialLinkText("Example 1: Element on page that is hidden")).click();
        $(By.xpath("//*[@id='start']/*")).shouldBe(visible);
        return this;
    }

    public DynamicLoadingPageSelenide selenideClicktoExampleLink2() {
        $(By.partialLinkText("Example 2: Element rendered after the fact")).click();
        $(By.xpath("//*[@id='start']/*")).shouldBe(visible);
        return this;
    }

    public DynamicLoadingPageSelenide selenideClickToStartButton() {
        $(By.xpath("//*[@id='start']/*")).click();
        $(By.xpath("//*[@class='example']/*/*[contains(text(),'Hello World!')]")).shouldBe(visible, Duration.ofSeconds(30));
        return this;
    }

    public String selenideGetStartResultText() {
        return $(By.xpath("//*[@class='example']/*/*[contains(text(),'Hello World!')]")).getText();
    }
}
