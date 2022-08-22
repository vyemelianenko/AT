package homeTasks.seleniumWebdriverBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ClickToeachButton {
    @Test
    public void clickToEachButton() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

//        WebElement cookies = driver.findElement(By.xpath("(//*[contains(text(),'Accept all')])[position()=2]"));
//        cookies.click();

        WebElement buttonBlueBar = driver.findElement(By.xpath("//*[@class='button']"));
        buttonBlueBar.click();

        WebElement buttonRedFoo = driver.findElement(By.xpath("//*[@class='button alert']"));
        buttonRedFoo.click();

        WebElement buttonGreenFoo = driver.findElement(By.xpath("//*[@class='button success']"));
        buttonGreenFoo.click();

//fucking miracle
        int postion = 4;
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@class,'large-10 columns')]/*/*/*/*[position()=" + postion + "]"));
        List<String> a = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            a.add(elements.get(i).getText());
            System.out.println(elements.get(i).getText());
        }

        driver.quit();
    }
}
