import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
//These imports require Junit to be integrated in your IDE they will not work otherwise.

public class CalculatorTest {

    //Declare test object for initialization in @BeforeEach for reuse.
    Calculator calculatorTestObject;

    @BeforeEach
    void setUp() {
        // Creates the test object which will be created before each test run.
        calculatorTestObject = new Calculator();
    }

    @AfterEach
    void tearDown() {
        // code to release resources (in this case only prints a message)
        System.out.println("Method resources released.");
    }

    @DisplayName("Test addition of int within range returns success") //Name displayed in result for readability.
    @ParameterizedTest //Alternative to @Test for passing multiple values to the test.
    @ValueSource(ints = {1, 12, 10, -1}) //Arguments to be passed as single parameter "numberPassed" total of 4 runs.
    void testSquareOfSingleIntegerNumber(int numberPassed) {
        int expectedResult = numberPassed * numberPassed;
        int actualResult = calculatorTestObject.squareOfSingleIntegerNumber(numberPassed);

        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test adding two integers within range.")
    @Test
    void testAddingOfTwoIntegerNumbersWithinIntegerRange() {

        // call method being tested with test data
        int resultReturned = calculatorTestObject.addTwoIntegerNumbers(5,10);

        // check if actual value is equal to expected value
        Assertions.assertEquals( 15, resultReturned);
    }

    @DisplayName("Test square of a number with invalid values has exception")
    @ParameterizedTest
    @ValueSource(ints = {Integer.MAX_VALUE, Integer.MIN_VALUE})
    void testSquareOfSingleIntegerNumberOutsideIntegerRangeHasException(int numberPassed) {
        assertThrows(ArithmeticException.class, () -> {
            calculatorTestObject.squareOfSingleIntegerNumber(numberPassed);
        });
    }

   @DisplayName("Test square of a number with valid values but changed actual is not equal")
   @ParameterizedTest
   @ValueSource(ints = {2, 45, 66, 77})
   void testSquareOfSingleIntegerNumberInRangeDeviatesResult(int numberPassed) {
       int expectedResult = numberPassed * numberPassed ;
       int actualResult =  calculatorTestObject.squareOfSingleIntegerNumber(numberPassed) + 1;

       assertNotEquals(expectedResult, actualResult);
   }

   @DisplayName("Test division of int within range returns success")
   @ParameterizedTest
   @CsvSource( // vvv 3 parameters for each run. 3 runs total vvv
           {
                   "6, 3, 2",
                   "12, 5, 2",
                   "15, 3, 5"
           }
   )
   void testDivideTwoIntegerNumbersWithinRangeReturnsSuccess(int number1, int number2, int expectedResult) {
       int actualResult =  calculatorTestObject.divideTwoIntegerNumbers(number1,number2);

       assertEquals(expectedResult, actualResult);

   }
}
