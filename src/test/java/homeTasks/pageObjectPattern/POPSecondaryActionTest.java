package homeTasks.pageObjectPattern;

import com.provectus.pages.HoverMenuPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import webDriverTests.CrossbrowsertestingTest;

import java.time.Duration;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class POPSecondaryActionTest extends CrossbrowsertestingTest {
    @Test
    public void popSecondaryActonTest() {
        HoverMenuPage hoverMenuPage = openApp().goToHoverMenu();
        hoverMenuPage.navigateToSecondaryActionMenu();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String alert = hoverMenuPage.getSecondaryActionMessage();

        Assert.assertTrue(alert.contains("Secondary action in the menu was clicked successfully!"), "message is not correct");
    }
}
