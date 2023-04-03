import com.digital.Calculator;
import com.digital.SomeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class CalculatorTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void addTwoNumbersTest(){
        assertEquals(Calculator.add(2,2),4);
        assertEquals(Calculator.add(2,2),3);

    }

    @Test
    public void testSoftAssert(){
        softAssert.assertEquals(Calculator.add(2,2), 4);
        softAssert.assertEquals(Calculator.add(2,2),5);
        softAssert.assertEquals(Calculator.add(2,2), 6);
        softAssert.assertEquals(Calculator.add(2,2), 7);
        softAssert.assertEquals(Calculator.add(2,2), 8);
        softAssert.assertAll();
    }

    @Test
    public void testAssertTrue(){
        assertTrue(SomeClass.isFunny(true));
        assertFalse(false);
    }

    @Test
    public void  test123(){
        assertNotNull(null);
    }
}
