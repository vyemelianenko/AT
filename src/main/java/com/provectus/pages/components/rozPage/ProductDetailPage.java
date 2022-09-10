package com.provectus.pages.components.rozPage;

import com.provectus.pages.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ProductDetailPage extends BasePage {
    public Header header;

    public ProductDetailPage(WebDriver driver) {
        super();
        header = new Header(driver);
    }

    public String getPrice() {
        ///
        return "";
    }

    public void addToCard() {
        //
    }
}
