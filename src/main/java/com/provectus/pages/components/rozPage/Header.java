package com.provectus.pages.components.rozPage;

import com.provectus.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Header extends BasePage {

//    public final By logo = By.cssSelector(".logo");
    @FindBy (css= ".logo")
    private  WebElement logo;

    @FindBy (css=".seacrh-input")
    private WebElement seacrhInput;
//    public final By seacrhInput = By.cssSelector(".search-input");

    public Header(WebDriver driver) {
        super();
        PageFactory.initElements(driver,this);
    }

    public void goToMainPage() {
        logo.click();
    }

    public void searchProduct(String product) {
        seacrhInput.sendKeys(product + Keys.ENTER);
    }
}
