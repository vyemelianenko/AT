package webDriverTests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import javax.swing.text.Highlighter;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class BaseTestSelenide {


    @BeforeClass
    public static void setup() {

        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        Configuration.browser = "chrome";
        Configuration.browserPosition = "890x10";
        Configuration.browserSize = "780x950";

        open("/");

    }

    @AfterClass
    public static void logout() {
        closeWebDriver();
    }

}
