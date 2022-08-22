package homeTasks.seleniumWebDriverAdvanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ShowMeYourName {
    @Test
    public void showMeYourName() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions action = new Actions(driver);
        WebElement user1 = driver.findElement(By.xpath("//*[@class='figure'][position()=1]"));
        action.moveToElement(user1)
                .pause(Duration.ofSeconds(1))
                .perform();
        Assert.assertEquals("name: user1\n" +
                "View profile", user1.getText());

        WebElement user2 = driver.findElement(By.xpath("//*[@class='figure'][position()=2]"));
        action.moveToElement(user2)
                .pause(Duration.ofSeconds(1))
                .perform();
        Assert.assertEquals("name: user2\n" +
                "View profile", user2.getText());

        WebElement user3 = driver.findElement(By.xpath("//*[@class='figure'][position()=3]"));
        action.moveToElement(user3)
                .pause(Duration.ofSeconds(1))
                .perform();
        Assert.assertEquals("name: user3\n" +
                "View profile", user3.getText());

        driver.quit();
    }

}
