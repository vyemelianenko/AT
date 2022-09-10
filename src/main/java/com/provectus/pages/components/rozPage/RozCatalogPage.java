package com.provectus.pages.components.rozPage;

import com.provectus.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class RozCatalogPage extends BasePage {
    private final By products = By.cssSelector("li[rzgridtilelayout]");


    public RozCatalogPage (WebDriver driver) {
        super();
//        PageFactory.initElements();
    }

    public void findProduct(int index) {
//        return new ProductComponent(products.get(index-1));
        return ;
    }

//    private void String getProductName(int productNum) {
//        WebElement item = products.get(productNum-1);
//        return new ProductComponent(item).getProductName();
    }

//    public void String getProductPrice(int productNum) {
//        WebElement item = products.get(productNum-1);
//        return new ProductComponent(item).getProductPrice();
//    }


