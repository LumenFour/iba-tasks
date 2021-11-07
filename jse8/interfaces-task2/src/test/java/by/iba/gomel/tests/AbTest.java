package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Ab;
import by.iba.gomel.InterfA;
import by.iba.gomel.InterfB;

public class AbTest {

    Ab ab = new Ab();

    @Test
    public void testGetAsInt() {
        final int expected = this.ab.getAsInt();
        final int actual = 0;
        Assert.assertEquals("Test successfull", expected, actual);
    }

    @Test
    public void testTest() {
        final int expected = this.ab.test();
        final int actual = 0;
        Assert.assertEquals("Test successfull", expected, actual);
    }

    @Test
    public void testTestDefault() {
        final int expected = this.ab.testDefault(27);
        final int actual = 27;
        Assert.assertEquals("Test successfull", expected, actual);
    }

    @Test
    public void testTestDefaultB() {
        final int expected = InterfB.testDefault(27);
        final int actual = 27;
        Assert.assertEquals("Test successfull", expected, actual);
    }

    @Test
    public void testTestStatic() {
        final int expected = this.ab.testStatic();
        final int actual = 15;
        Assert.assertEquals("Test successfull", expected, actual);
    }

    @Test
    public void testTestStaticA() {
        final int expected = InterfA.testStatic(15);
        final int actual = 15;
        Assert.assertEquals("Test successfull", expected, actual);
    }

    @Test
    public void testTestStaticB() {
        final int expected = InterfB.testStatic(15);
        final int actual = 15;
        Assert.assertEquals("Test successfull", expected, actual);
    }

}
