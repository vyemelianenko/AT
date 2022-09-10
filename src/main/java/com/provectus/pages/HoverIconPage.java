package com.provectus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class HoverIconPage extends BasePage {
    @FindBy(xpath = "//*[@class='figure'][position()=1]")
    private WebElement user1;

    @FindBy(xpath = "//*[@class='figure'][position()=2]")
    private WebElement user2;

    @FindBy(xpath = "//*[@class='figure'][position()=3]")
    private WebElement user3;

    public HoverIconPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public HoverIconPage navigateToUser1() {
        Actions action = new Actions(driver);
        action.moveToElement(user1)
                .pause(Duration.ofSeconds(1))
                .perform();
        Assert.assertEquals("name: user1\n" +
                "View profile", user1.getText());
        return new HoverIconPage(driver);
    }

    public HoverIconPage navigateToUser2() {
        Actions action2 = new Actions(driver);
        action2.moveToElement(user2)
                .pause(Duration.ofSeconds(2))
                .perform();
        Assert.assertEquals("name: user2\n" +
                "View profile", user2.getText());
        action2.pause(Duration.ofSeconds(1));
        return new HoverIconPage(driver);
    }

    public HoverIconPage navigateToUser3() {
        Actions action3 = new Actions(driver);
        action3.moveToElement(user3)
                .pause(Duration.ofSeconds(2))
                .perform();
        Assert.assertEquals("name: user3\n" +
                "View profile", user3.getText());
        return this;
    }
}
