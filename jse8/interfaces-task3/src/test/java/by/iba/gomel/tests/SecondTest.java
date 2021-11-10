package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Second;

public class SecondTest {

    Second second = new Second();

    @Test
    public void testLog() {
        final String actual = this.second.log("Hello2");
        final String expected = "Hello2";
        Assert.assertEquals("Test successful", expected, actual);
    }

}
