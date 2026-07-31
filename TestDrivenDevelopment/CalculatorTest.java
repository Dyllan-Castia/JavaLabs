import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest { //Contains Lambda **last code block**

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
    
    @Test
    public void testAddTwoIntegerMethodAddsCorrectly() {
        int result = calculatorTestObject.addTwoIntegers(2, 4);
        assertEquals(6, result);
    }
    
    @Test
    public void testAddTwoIntegerMethodOnRangeExceedThrowsException() {
        assertThrows(
                ArithmeticException.class, () ->
                        calculatorTestObject.addTwoIntegers(Integer.MAX_VALUE, 1)
        );
    }
}
