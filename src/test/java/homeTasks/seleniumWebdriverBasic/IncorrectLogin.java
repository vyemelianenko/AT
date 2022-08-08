package homeTasks.seleniumWebdriverBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class IncorrectLogin {
    @Test
    public void corectTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        //        WebElement cookies = driver.findElement(By.xpath("(//*[contains(text(),'Accept all')])[position()=2]"));
        //        cookies.click();

        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        username.clear();
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.clear();
        password.sendKeys("Wrong!!");

        WebElement clickToLogin = driver.findElement(By.xpath("//*[@class='radius']"));
        clickToLogin.click();

        WebElement errorMessage = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='flash error']")));

        String messageFromWeb = errorMessage.getText();
        String correctMessage = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(messageFromWeb,correctMessage,"message is not correct");

        driver.quit();
    }
}
