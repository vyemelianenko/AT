package webDriverTests;

import com.provectus.pages.MainPage;
import com.provectus.pages.SecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class LoginTestPo extends BaseTest {
    @Test
    public void loginTest() {


//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com");

//        MainPage mainPage = new MainPage(driver);
//        MainPage mainPage = openApp();
//        SecurePage securePage = mainPage.goToAuthPage()
        SecurePage securePage = openApp().goToAuthPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();
        String alert = securePage.getAlertText();

        Assert.assertTrue(alert.contains("You logged into a secure area!"), "User should be logged in");
        Assert.assertEquals(alert,"You logged into a secure area!","The error");
        securePage.logout();

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.setUsername("tomsmith");
//        loginPage.setPassword("SuperSecretPassword!");
//        loginPage.clickLoginButton();

//        SecurePage securePage = new SecurePage(driver);
//        String alert = securePage.getAlertText();

//        Assert.assertTrue(alert.contains("You logged into a secure area!"), "User should be logged in");
//        securePage.logout();

//        driver.quit();
    }
}
