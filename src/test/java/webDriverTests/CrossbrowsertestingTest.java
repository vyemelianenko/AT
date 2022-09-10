package webDriverTests;

import com.provectus.pages.MainPage;
import com.provectus.pages.MainPageForCrossbrowsertesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CrossbrowsertestingTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public MainPageForCrossbrowsertesting openApp() {
        driver.get("https://crossbrowsertesting.github.io");
        return new MainPageForCrossbrowsertesting();
    }

}
