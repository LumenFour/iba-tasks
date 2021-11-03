package by.iba.gomel.packages.task;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * The Class FibonacciNumber.
 */
public final class FibonacciNumber {
    
    public static final int TWO  = 2;
    public static final int FOUR = 4;
    public static final int FIVE = 5;

    /**
     * Instantiates a new fibonacci number.
     */
    private FibonacciNumber(){
    }
    
    /**
     * Checks if is perfect square.
     *
     * @param number the number
     * @return true, if is perfect square
     */
    public static boolean isPerfectSquare(final int number) {
        final int sqr = (int) sqrt(number);
        return (int) pow(sqr, FibonacciNumber.TWO) == number;
    }

    
    /**
     * Checks if is fibonacci number.
     *
     * @param number the number
     * @return true, if is fibonacci number
     */
    public static boolean isFibonacciNumber(final int number) {
        return FibonacciNumber.isPerfectSquare(
                (FibonacciNumber.FIVE * (int) pow(number, FibonacciNumber.TWO))
                        + FibonacciNumber.FOUR)
                || FibonacciNumber.isPerfectSquare(
                        (FibonacciNumber.FIVE * (int) pow(number, FibonacciNumber.TWO))
                                - FibonacciNumber.FOUR);
    }

}
