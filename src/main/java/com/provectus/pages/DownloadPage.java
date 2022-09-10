package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DownloadPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(),'Test_case_1.txt')]")
    private WebElement documentName;

//    @FindBy(tagName = "h3")
//    private WebElement fileDownloaderHeader;

    public DownloadPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public DownloadPage downloadFile(String textName) throws InterruptedException {
//        documentName.click();
//        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='flash success']")));
        findDocumentByText(textName).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
//        sleep(1000);
        return new DownloadPage();
    }

    public WebElement findDocumentByText(String textName) {
        String fieldNameXpath = String.format("//*[contains(text(),'%s')]", textName);
        return driver.findElement(By.xpath(fieldNameXpath));
    }

}
