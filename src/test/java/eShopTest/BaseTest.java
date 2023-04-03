package eShopTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public interface BaseTest {

    @BeforeSuite
    default void setup() {
        System.out.println("chrome");
    }

    @BeforeTest
    default void openSite() {
        System.out.println("Open site");
    }

    @AfterTest(alwaysRun = true)
    default void closeSite() {
        System.out.println("Close site");

    }
}
