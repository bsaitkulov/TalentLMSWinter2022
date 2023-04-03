package testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void createNewUserTest() {
        User firstUser = new User("John", 30);
        Assert.assertNotNull(firstUser);
    }

    @Test(dependsOnMethods = "createNewUserTest")
    public void loginTest() {
        Assert.assertTrue(true);
    }

    @DataProvider(name = "InputValues")
    public Object[][] getInputValues() {
        return new Object[][]{
                {"john@gmail.com", "Valid Pass"},
                {"johngmail.com", "Valid Pass"},
                {"john@gmail.com", "Invalid Pass"}
        };
    }
    @Test(dataProvider = "InputValues")
    public void testLoginFun(String username, String password){
        System.out.println(username + " " + password);
    }
}

