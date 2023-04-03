package annotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class DemoClass {

    @BeforeMethod
    public void demoBeforeMethod(){
        System.out.println("Demo Before Method");
    }

    @Test (groups = "group1")
    public void demoTest1(){
        System.out.println("Demo Test1");
    }

    @Test (groups = "group2")
    public void demoTest2(){
        System.out.println("Demo Test2");
    }


    @AfterMethod
    public void demoAfterMethod(){
        System.out.println("Demo After Method");
    }

    @BeforeClass
    public void demoBeforeClass(){
        System.out.println("Demo Before Class");
    }
    @AfterClass
    public void demoAfterClass(){
        System.out.println("Demo After Class");
    }

    @BeforeTest
    public void demoBeforeTest(){
        System.out.println("Demo Before Test");
    }
    @AfterTest
    public void demoAfterTest(){
        System.out.println("Demo After Test");
    }
    @BeforeSuite
    public void demoBeforeSuite(){
        System.out.println("Demo Before Suite");
    }
    @AfterSuite
    public void demoAfterSuite(){
        System.out.println("Demo After Suite");
    }
    @BeforeGroups (groups = "group2")
    public void demoBeforeGroup(){
        System.out.println("Demo Before Group2");
    }
    @AfterGroups (groups = "group2")
    public void demoAfterGroup(){
        System.out.println("Demo After Group2");
    }
}
