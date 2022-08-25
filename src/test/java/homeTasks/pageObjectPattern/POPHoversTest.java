package homeTasks.pageObjectPattern;

import com.provectus.pages.HoverIconPage;
import org.testng.annotations.Test;
import webDriverTests.BaseTest;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class POPHoversTest extends BaseTest {
    @Test
    public void popHovers() {
        HoverIconPage hoverIconPage = openApp().goToHoversPage();
        hoverIconPage.navigateToUser1()
                .navigateToUser2()
                .navigateToUser3();
    }
}
