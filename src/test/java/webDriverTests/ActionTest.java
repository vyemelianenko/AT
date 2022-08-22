package webDriverTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ActionTest {
    @Test
    public void actionTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/ua/");
        Actions actions = new Actions(driver);

        driver.findElement(By.id("fat-menu")).click();
        actions.moveToElement(driver.findElement(By.cssSelector(".menu-categories__item:nth-of-type(1)")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.cssSelector(".menu-categories__item:nth-of-type(2)")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.cssSelector(".menu-categories__item:nth-of-type(1)")))
                .perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".header__button")))).click();
        WebElement headerButton = driver.findElement(By.cssSelector(".header__button"));

        wait.until(isLoaderDisaplyed(headerButton));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", headerButton);

        try {
            js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.partialLinkText(" Оренда приміщень ")));
            Thread.sleep(10000); //10 sec покласти поток спати
        } catch (InterruptedException e) {} ;


        driver.quit();
    }

    private ExpectedCondition<Boolean> isLoaderDisaplyed(WebElement loader) {
//        return el -> element.findElement(By.cssSelector("sub-e1")).isDisplayed();

        ExpectedCondition<Boolean> expectedCondition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return !loader.isDisplayed();
            }
        };
        return expectedCondition;
    }
}
