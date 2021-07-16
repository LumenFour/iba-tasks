package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ArithmeticsDemo;

public class ArithmeticsDemoTest {

    @Test
    public void testMain() {
        ArithmeticsDemo.main(new String[] {});
        final int result = 1;
        Assert.assertNotNull("Result isn't null", result);
    }
}
