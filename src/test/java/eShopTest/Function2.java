package eShopTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Function2 implements BaseTest{

   @BeforeMethod
        public void openCatalog(){
            System.out.println("Go to cart");
        }

    @Test (description = "this test check smth", priority = 0)
    public void test21(){
        System.out.println("Product Price check");
    }
    @Test ( priority = 1)
    public void test22(){
        System.out.println("Product Name check");;
    }
}
