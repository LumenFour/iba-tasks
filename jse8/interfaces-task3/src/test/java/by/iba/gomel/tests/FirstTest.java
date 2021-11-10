package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.First;
import by.iba.gomel.Log;

public class FirstTest {

    First first = new First();

    @Test
    public void testLogStaticStringString() {
        final String actual = this.first.log("Hello");
        final String expected = "Hello";
        Assert.assertEquals("Test successful", expected, actual);
    }

    @Test
    public void testLogString() {
        final String actual = First.log("again", "Hello");
        final String expected = "Hello" + "again";
        Assert.assertEquals("Test successful", expected, actual);
    }

    @Test
    public void testLogStringStatic() {
        final String actual = Log.log("again", "Hello");
        final String expected = "Hello" + "again";
        Assert.assertEquals("Test successful", expected, actual);
    }

}
