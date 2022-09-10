package com.provectus.pages.components.rozPage;

import com.provectus.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class RozMainPage extends BasePage {

    private final By byMenu = By.cssSelector(".menu");
    public Header header;


    public RozMainPage(WebDriver driver) {
        super();
        header = new Header(driver);
    }

    public void selectItemMenu(String item) {
        //
    }
}
