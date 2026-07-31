public class Calculator {
    public int addTwoIntegers(int number1, int number2) {
        long result = (long) number1 + number2;

        if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException("Overflow!");
        }
        if (result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Underflow!");
        }
        return (int) result;
    }
}
