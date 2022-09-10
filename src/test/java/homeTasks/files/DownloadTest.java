package homeTasks.files;

import com.provectus.pages.DownloadPage;
import com.provectus.pages.UploadPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import webDriverTests.BaseTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DownloadTest extends BaseTest {
    private final String nameOfFileToUpload = "Test_case_1.txt";
    private final String nameOfFileToDownload = "mouseAction.txt";

    @Test
    public void downloadTest() throws InterruptedException, IOException {
        DownloadPage downloadPage = openApp().goToDownloadPage();
        downloadPage.downloadFile(nameOfFileToDownload);

        FileWriter file = new FileWriter("/Users/vemelianenko/Downloads" + nameOfFileToDownload, true);

        file.write("new Text");
        file.write("\n");

        file.close();


        UploadPage uploadPage = openApp().goToUploadPage();
        uploadPage.upload("/Users/vemelianenko/Downloads" + nameOfFileToUpload);

        Assert.assertEquals(uploadPage.getPageTitle(), "File Uploaded!", "compare title after upload");

    }
}
