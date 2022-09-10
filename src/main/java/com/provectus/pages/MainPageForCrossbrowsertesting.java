package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class MainPageForCrossbrowsertesting extends BasePage {

    public MainPageForCrossbrowsertesting() {
        super(); //виклик родителя конструтора
    }

    public DragAndDropPage goToDragAndDropPage() {
        driver.findElement(By.linkText("Drag and Drop")).click();
        return new DragAndDropPage(driver);
    }

    public HoverMenuPage goToHoverMenu() {
        driver.findElement(By.linkText("Hover Menu")).click();
        return new HoverMenuPage(driver);
    }

}
