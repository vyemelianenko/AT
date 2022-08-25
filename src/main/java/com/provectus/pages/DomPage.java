package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DomPage extends BasePage {

    @FindBy(xpath = "//*[@class='button']")
    private WebElement buttonBlueBar;

    @FindBy(xpath = "//*[@class='button alert']")
    private WebElement buttonRedFoo;

    @FindBy(xpath = "//*[@class='button success']")
    private WebElement buttonGreenFoo;

    public DomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public DomPage clickToBlueButton() {
        buttonBlueBar.click();
        return new DomPage(driver);
    }

    public DomPage clickToRedButton() {
        buttonRedFoo.click();
        return new DomPage(driver);
    }

    public DomPage clickToGreenButton() {
        buttonGreenFoo.click();
        return new DomPage(driver);
    }

    public List<String> findElements(int position) {
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@class,'large-10 columns')]/*/*/*/*[position()=" + position + "]"));
        List<String> a = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            a.add(elements.get(i).getText());
            System.out.println(elements.get(i).getText());
        }
        return a;
    }
}

