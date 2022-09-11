package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import static java.lang.Thread.sleep;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class UploadPage extends BasePage {

    @FindBy (id = "file-upload")
    private WebElement chooseFile;

    @FindBy (xpath = "//*[@class='button']")
    private WebElement uploadButton;

    @FindBy (xpath = "//*[@class='example']/*[contains(text(),'File Uploaded!')]")
    private WebElement fileuploadedSussccfully;

    @FindBy(tagName = "h3")
    private WebElement pageTitle;


    public UploadPage(){

        super();
        PageFactory.initElements(driver, this);
    }


    public String getPageTitle(){
        return pageTitle.getText();
    }

    public UploadPage selectFile(String path){
        chooseFile.sendKeys(path);
        return this;
    }

    public UploadPage clickUpload(){
        uploadButton.click();
        return this;
    }

    public SecurePage upload(String path){
        selectFile(path);
        clickUpload();
        return new SecurePage(driver);
    }


}
