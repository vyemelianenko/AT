package homeTasks.TestNG;

import com.provectus.models.UserDataForNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class UserDataForNGCustom {

    @Test(dataProvider = "userProviderCustom", suiteName = "Suite1", groups = {"group1"}, priority = 20)
    public void testData(UserDataForNG user) {
        System.out.println(user.getUsername() + " " + user.getPassword() + " " + user.getRole());
        assertNotEquals(user.getUsername(),"user13","User1 is already exist");
    }

    //масив масивів - передати 1 клч і масив даних ->
    @DataProvider(name = "userProviderCustom")
    public Object[][] userProviderCustom() {

        UserDataForNG userDataForNG1 = new UserDataForNG();
        userDataForNG1.setUsername("user1");
        userDataForNG1.setPassword("12345");
        userDataForNG1.setRole("user");

        UserDataForNG userDataForNG2 = new UserDataForNG();
        userDataForNG2.setUsername("user2");
        userDataForNG2.setPassword("12345");
        userDataForNG2.setRole("admin");

        UserDataForNG userDataForNG3 = new UserDataForNG();
        userDataForNG3.setUsername("user3");
        userDataForNG3.setPassword("123456");
        userDataForNG3.setRole("quest");

        Object[][] result = {
                {userDataForNG1},
                {userDataForNG2},
                {userDataForNG3},
        };
        return result;
    }

    @Test(dataProvider = "userProviderCustom",groups = {"group2"},dependsOnGroups = {"group1"}, priority = 100)
    public void test2AddErrorCondition(UserDataForNG user) {
//        if (user.getRole().equals("quest") && user.getPassword().equals("123456")) {
//            throw new RuntimeException("quest is not ready yet");
        assertNotEquals(user.getRole(), "quest", "Guest is not ready for test");
    }
}
