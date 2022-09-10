package webDriverTests;

import com.provectus.pages.MainPage;
import com.provectus.singleTon.DriverHoler;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class BaseTest {
//    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        DriverHoler.setDriver(driver);
    }

    @AfterClass
    public void tearDown() {
        DriverHoler.getDriver().quit();
    }

    public MainPage openApp() {
        DriverHoler.getDriver().get("https://the-internet.herokuapp.com");
        return new MainPage();
    }

}
