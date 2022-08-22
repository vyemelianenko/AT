package homeTasks.seleniumWebDriverAdvanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DragAndDropped {
    @Test
    public void dragAndDropped() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        WebElement dragMeToMyTarget = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement dropMeHere = driver.findElement(By.xpath("//*[@id='droppable']"));


        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(dragMeToMyTarget, dropMeHere).perform();

        WebElement droppedMessage = driver.findElement(By.xpath("//*[@id='droppable']/*[contains(text(),'Dropped!')]"));
        Assert.assertEquals("Dropped!",droppedMessage.getText());

        driver.quit();
    }
}
