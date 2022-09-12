package homeTasks.selenide;

import com.provectus.pages.DynamicLoadingPage;
import com.provectus.pages.DynamicLoadingPageSelenide;
import com.provectus.pages.MainPageSelenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import webDriverTests.BaseTestSelenide;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class SelenideDynamicallyLoadedPageElementsTest extends BaseTestSelenide {
    @Test
    public void selenideDynamicallyLoadedPageElementsTest() {

        DynamicLoadingPageSelenide dynamicLoadingPage = new MainPageSelenide().goToDynamicLoadingPage();
        dynamicLoadingPage.selenideClicktoExampleLink1()
                .selenideClickToStartButton();
        Assert.assertTrue(dynamicLoadingPage.selenideGetStartResultText().contains("Hello World!"), "Message after click to Submit button is not correct");

        DynamicLoadingPageSelenide dynamicLoadingPage2 = new MainPageSelenide().goToDynamicLoadingPage();
        dynamicLoadingPage.selenideClicktoExampleLink2()
                .selenideClickToStartButton();
        Assert.assertTrue(dynamicLoadingPage.selenideGetStartResultText().contains("Hello World!"), "Message after click to Submit button is not correct");
    }
}

