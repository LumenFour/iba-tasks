package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.packages.task.FibonacciNumber;

public class FibonacciNumberTest {
    @Test
    public void testIsFibonacciNumberNeg() {
        final boolean expected = false;
        Assert.assertEquals("Number 7 isn't Fibonacci number", expected,
                FibonacciNumber.isFibonacciNumber(7));
        Assert.assertEquals("Number 11 isn't Fibonacci number", expected,
                FibonacciNumber.isFibonacciNumber(11));
        Assert.assertEquals("Number 12 isn't Fibonacci number", expected,
                FibonacciNumber.isFibonacciNumber(12));
    }

    @Test
    public void testIsFibonacciNumberPol() {
        final boolean expected = true;
        Assert.assertEquals("Number 1 is Fibonacci number", expected,
                FibonacciNumber.isFibonacciNumber(1));
        Assert.assertEquals("Number 2 is Fibonacci number", expected,
                FibonacciNumber.isFibonacciNumber(2));
        Assert.assertEquals("Number 21 is Fibonacci number", expected,
                FibonacciNumber.isFibonacciNumber(21));
    }
}
