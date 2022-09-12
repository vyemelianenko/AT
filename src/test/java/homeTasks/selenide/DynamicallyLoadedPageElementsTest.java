package homeTasks.selenide;

import com.provectus.pages.DynamicLoadingPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import webDriverTests.BaseTest;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DynamicallyLoadedPageElementsTest extends BaseTest {

    @Test
    public void dynamicallyLoadedPageElementsTest() {
        DynamicLoadingPage dynamicLoadingPage = openApp().goToDynamicLoadingPage();

        dynamicLoadingPage.selenideClicktoExampleLink1()
                .selenideClickToStartButton();
        Assert.assertTrue(dynamicLoadingPage.selenideGetStartResultText().contains("Hello World!"), "Message after click to Submit button is not correct");

        dynamicLoadingPage = openApp().goToDynamicLoadingPage();

        dynamicLoadingPage.selenideClicktoExampleLink2()
                .selenideClickToStartButton();
        Assert.assertTrue(dynamicLoadingPage.getStartResultsText().contains("Hello World!"), "Message after click to Submit button is not correct");
    }
}
