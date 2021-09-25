package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Type;

public class TypeTest {
    Type                       t   = new Type();
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testTypeOfByte() {
        final byte b = 1;
        final String s = this.t.typeOf(b);
        Assert.assertEquals("Error", "1-> byte\n", s);
    }

    @Test
    public void testTypeOfChar() {
        final char c = 'C';
        final String s = this.t.typeOf(c);
        Assert.assertEquals("Error", "C-> char\n", s);
    }

    @Test
    public void testTypeOfDouble() {
        final double d = 1.1d;
        final String s = this.t.typeOf(d);
        Assert.assertEquals("Error", "1.1-> double\n", s);
    }

    @Test
    public void testTypeOfFloat() {
        final float f = 2.3f;
        final String s = this.t.typeOf(f);
        Assert.assertEquals("Error", "2.3-> float\n", s);
    }

    @Test
    public void testTypeOfInt() {
        final int i = 7;
        final String s = this.t.typeOf(i);
        Assert.assertEquals("Error", "7-> integer\n", s);
    }

    @Test
    public void testTypeOfString() {
        final String str = "Wrong";
        final String s = this.t.typeOf(str);
        Assert.assertEquals("Error", "Wrong-> string\n", s);
    }

}
