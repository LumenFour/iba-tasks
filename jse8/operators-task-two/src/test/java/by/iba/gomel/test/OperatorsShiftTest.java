package by.iba.gomel.test;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.OperatorsShift;

public class OperatorsShiftTest {

    @Test()
    public void testLeftShiftNegative() {
        final int actual = OperatorsShift.leftShiftNegative();
        final int expected = -56;
        Assert.assertEquals("-56", expected, actual);
    }

    @Test
    public void testLeftShiftPositive() {
        final int actual = OperatorsShift.leftShiftPositive();
        final int expected = 12;
        Assert.assertEquals("12", expected, actual);
    }

    @Test
    public void testRightShiftNegative() {
        final int actual = OperatorsShift.rightShiftNegative();
        final int expected = -1;
        Assert.assertEquals("-1", expected, actual);
    }

    @Test
    public void testRightShiftPositive() {
        final int actual = OperatorsShift.rightShiftPositive();
        final int expected = 0;
        Assert.assertEquals("0", expected, actual);
    }

    @Test
    public void testUnsignedRightShiftPositive() {
        final int actual = OperatorsShift.unsignedRightShiftPositive();
        final int expected = 0;
        Assert.assertEquals("0", expected, actual);
    }

}
