package homeTasks.pageObjectPattern;

import com.provectus.pages.DragAndDropPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import webDriverTests.CrossbrowsertestingTest;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class POPDragAndDrop extends CrossbrowsertestingTest {
    @Test
    public void popDragAndDrop() {
        DragAndDropPage dragAndDropPage = openApp().goToDragAndDropPage();
        dragAndDropPage.dragTargetToHere();
        String alert = dragAndDropPage.verifySuccessMessage();

        Assert.assertTrue(alert.contains("Dropped!"), "Something wrond with message");
    }
}
