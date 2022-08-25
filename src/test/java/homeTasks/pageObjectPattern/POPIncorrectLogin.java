package homeTasks.pageObjectPattern;

import com.provectus.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import webDriverTests.BaseTest;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class POPIncorrectLogin extends BaseTest {
    @Test
    public void popInCorrectLogin() throws InterruptedException {
        LoginPage loginPage = openApp().goToAuthPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword")
                .clickLoginWithIncorrectCreds();
        String error = loginPage.verifyErrorMessage();

        Assert.assertTrue(error.contains("Your password is invalid!\n" +
                "×"), "Put correct username or passwrod");
        loginPage.logout();
    }
}
