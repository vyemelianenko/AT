package com.provectus.pages.components.rozPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ProductComponent {

    @FindBy(css = ".goods-tile_title")
    private WebElement productName;

    @FindBy(css = ".goods-tile_price")
    private WebElement prodPrice;
    //    private final By productName = By.cssSelector(".goods-tile_title");
//    private final By prodPrice = By.cssSelector(".goods-tile_price");
    private WebElement parent;

    public ProductComponent(WebElement parent) {
        this.parent = parent;
        PageFactory.initElements(parent, this);
    }

    public String getProductName() {
        return productName.getText();
    }

    public String getProductPrice() {
        return prodPrice.getText();
    }
}
