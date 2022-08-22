package homeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class WDTest2 {
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
//        driver.findElement()
        driver.quit();
    }
}
