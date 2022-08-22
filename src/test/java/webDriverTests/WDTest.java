package webDriverTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class WDTest {
    @Test
    public void wdTest() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
//        driver.switchTo().alert().accept();

        driver.switchTo().frame(1);
        //search inside frame

        driver.switchTo().defaultContent();
        //search on the main page

        driver.navigate().refresh();
        driver.manage().window().maximize();

        driver.findElement(By.id("id"));
        driver.findElement(By.name("name"));
        driver.findElement(By.className("button"));

        driver.findElement(By.id("section")).findElement(By.className("form")).findElement(By.id("class"));
        driver.findElement(By.cssSelector("[2323]"));

        WebElement element = driver.findElement(By.id("id"));
        element.clear();
        element.getText();
        element.sendKeys("value to send input" + Keys.ENTER);

        element.click(); //right button click
        element.isDisplayed(); // isEnebale isSelected-  відображається елемент на страниці
//        driver.findElement()
        driver.quit();
    }
}
