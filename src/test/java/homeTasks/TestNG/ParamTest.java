package homeTasks.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ParamTest {
    @Parameters({"paramTest", "paramTest2"})
    @Test(groups = {"group1"})
    public void test1(String s1, String s2) {
        System.out.println("just output " + s1 + "222222 : " + s2);
    }
}
