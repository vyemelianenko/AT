package homeTasks.pageObjectPattern;

import com.provectus.pages.DomPage;
import org.testng.annotations.Test;
import webDriverTests.BaseTest;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class POPCLickToEachButton extends BaseTest {
    @Test
    public void popClickToEachButton() {
        DomPage domPage = openApp().goToDomPage();
        domPage.clickToBlueButton()
                .clickToGreenButton()
                .clickToGreenButton()
                .findElements(4);
    }
}
