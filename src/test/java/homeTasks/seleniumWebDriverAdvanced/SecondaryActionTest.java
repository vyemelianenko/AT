package homeTasks.seleniumWebDriverAdvanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class SecondaryActionTest {
    @Test
    public void secondaryActionTest(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

        //dropDown click
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.cssSelector(".dropdown-toggle:nth-of-type(1)")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Secondary Menu ')]")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Secondary Action')]")))
                .click()
                .perform();
        //select secondaryAction
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //assertText

        WebElement secondaryActionClickMessage = driver.findElement(By.xpath("//*[contains(text(),'Secondary action in the menu was clicked successfully!')]"));
        Assert.assertEquals("Secondary action in the menu was clicked successfully!",secondaryActionClickMessage.getText());
        driver.quit();
    }

}
