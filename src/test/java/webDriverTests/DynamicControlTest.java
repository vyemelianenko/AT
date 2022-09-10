package webDriverTests;

import com.provectus.pages.DynamicControlPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DynamicControlTest extends BaseTest {
    @Test
    public void dunTest() {
        DynamicControlPage dynamicControlPage = openApp().goToDynamicControlPage();

        Assert.assertTrue(dynamicControlPage.isCheckBoxDisaplyed());

        dynamicControlPage.removeCheckButton();

        Assert.assertFalse(dynamicControlPage.isCheckBoxDisaplyed());
    }
}
