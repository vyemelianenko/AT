package webDriverTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.stream.Collectors;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class SelectTest {
    @Test
    public void selectTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));

        select.getOptions().stream().map(el -> el.getText()).collect(Collectors.toList()); // зберегти всі опції

        select.selectByVisibleText("Option 2");


        driver.quit();
    }

    @Test
    public void alertTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.cssSelector("ul li:nth-child(3) button")).click();
        Alert alert = driver.switchTo().alert();
        String stringAlert = alert.getText();
        alert.sendKeys("send text");
        alert.accept();

        System.out.println(stringAlert);

        driver.quit();
    }

}
