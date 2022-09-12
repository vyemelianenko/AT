package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DynamicLoadingPage extends BasePage {

    @FindBy(partialLinkText = "Example 1: Element on page that is hidden")
    private WebElement example1Link1;

    @FindBy(partialLinkText = "Example 2: Element rendered after the fact")
    private WebElement example1Link2;

    @FindBy(xpath = "//*[@class='example']/*[contains(text(),'Example 1: Element on page that is hidden')]")
    private WebElement textOnExample1Link;

    @FindBy(xpath = "//*[@class='example']/*[contains(text(),'Example 2: Element rendered after the fact')]")
    private WebElement textOnExample2Link;

    @FindBy(tagName = "button")
    private WebElement startButton;

    @FindBy(xpath = "//*[@class='example']/*/*[contains(text(),'Hello World!')]")
    private WebElement textAfterClickStartButton;

    public DynamicLoadingPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public DynamicLoadingPage clickToExample1Link1() {
        example1Link1.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='example']/*[contains(text(),'Example 1: Element on page that is hidden')]")));
        return this;
    }

    public DynamicLoadingPage selenideClicktoExampleLink1() {
        $(By.partialLinkText("Example 1: Element on page that is hidden'")).click();
        $(By.tagName("Start")).shouldBe(visible, Duration.ofSeconds(30));
        return this;
    }

    public DynamicLoadingPage clickToExample1Link2() {
        example1Link2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='example']/*[contains(text(),'Example 2: Element rendered after the fact')]")));
        return this;
    }

    public DynamicLoadingPage selenideClicktoExampleLink2() {
        $(By.partialLinkText("Example 2: Element rendered after the fact'")).click();
        $(By.tagName("Start")).shouldBe(visible, Duration.ofSeconds(30));
        return this;
    }

    public String getPageTitleLink1() {
        return textOnExample1Link.getText();
    }

    public String getPageTitleLink2() {
        return textOnExample2Link.getText();
    }

    public DynamicLoadingPage clickToStartButton() {
        startButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='example']/*/*[contains(text(),'Hello World!')]")));
        return this;
    }

    public DynamicLoadingPage selenideClickToStartButton() {
        $(By.tagName("Start")).click();
        $(By.xpath("//*[@class='example']/*/*[contains(text(),'Hello World!')]")).shouldBe(visible,Duration.ofSeconds(30));
        return this;
    }

    public String getStartResultsText() {
        return textAfterClickStartButton.getText();
    }

    public String selenideGetStartResultText() {
        return $(By.xpath("//*[@class='example']/*/*[contains(text(),'Hello World!')]")).getText();
    }
}
