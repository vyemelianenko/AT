package webDriverTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class GoogleTest {
    @Test
    public void googleTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement cookies = driver.findElement(By.xpath("(//*[contains(text(),'Accept all')])[position()=2]"));
        cookies.click();
        

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.clear();
        searchInput.sendKeys("Selenium");

        driver.findElement(By.cssSelector("input[name='btnl']")).click();


        driver.quit();
    }
}
