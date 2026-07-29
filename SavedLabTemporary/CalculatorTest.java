import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculatorTestObject;

    @BeforeEach
    public void setUp() {
        calculatorTestObject = new Calculator();
    }

    @Test
    public void testCalculatorClassExists() {
        //Calculator calculatorTestObject = new Calculator();
        assertNotNull(calculatorTestObject);
    }

    @Test
    public void testAddTwoIntegersMethodExists() {
        //Calculator calculatorTestObject = new Calculator();
        calculatorTestObject.addTwoIntegers(2, 4);
    }

    /** TODO 11: create a test method named
     *          "testAddTwoIntegerMethodAddsCorrectly()"
     *          after TODO 12
     **/
    @Test
    public void testAddTwoIntegerMethodAddsCorrectly() {
        int result = calculatorTestObject.addTwoIntegers(2, 4);
        assertEquals(6, result);
    }

    /** TODO 15: in the test method named
     *           "testAddTwoIntegerMethodOnRangeExceedThrowsException()"
     *           which you created in TODO 14.
     *           assert that the method "addTwoIntegers()"
     *           of the class "Calculator"
     *           throws exception when
     *           Integer.MAX_VALUE and 1 are passed as parameters
     *           or the integer range is exceeded.
     **/
    @Test
    public void testAddTwoIntegersMethodOnRangeExceedThrowsException() {
        int result = calculatorTestObject.addTwoIntegers(Integer.MAX_VALUE, 1);
        assertThrows(Exception, result);
    }
}
