package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Conversions;

public class ConversionsTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testPrimConvertToByte() {
        Conversions.primConvertToByte((byte) 2);
        Assert.assertEquals("The result should be 1000", "Byte 1000\n", this.log.getLog());
    }

    @Test
    public void testPrimConvertToInt() {
        Conversions.primConvertToInt(3);
        Assert.assertEquals("The result should be 1005", "Int 1005\n", this.log.getLog());
    }

    @Test
    public void testPrimConvertToLong() {
        Conversions.primConvertToLong(5);
        Assert.assertEquals("The result should be 2010", "Long 2010", this.log.getLog());
    }

}
