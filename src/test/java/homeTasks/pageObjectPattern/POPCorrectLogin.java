package homeTasks.pageObjectPattern;

import com.provectus.pages.SecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import webDriverTests.BaseTest;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class POPCorrectLogin extends BaseTest {
    @Test
    public void popCorrectLogin() {
        SecurePage secruePage = openApp().goToAuthPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();
        String alert = secruePage.getAlertText();

        Assert.assertTrue(alert.contains("You logged into a secure area!"), "User should be logged in");
        secruePage.logout();
    }
}
