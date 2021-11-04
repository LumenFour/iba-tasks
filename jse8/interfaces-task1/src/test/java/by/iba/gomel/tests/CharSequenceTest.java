package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CharSequenceDemo;

public class CharSequenceTest {

    CharSequenceDemo test2 = new CharSequenceDemo(
            "Write a class that implements the CharSequence interface found in the javalang package");

    private static int random(final int max) {
        return (int) Math.round(Math.random() * (max + 1));
    }

    @Test
    public void testCharAt() {
        final int expected = this.test2.charAt(0);
        final int actual = 0;
        Assert.assertEquals("Zero", expected, actual);
    }

    @Test
    public void testLength() {
        final int expected = this.test2.length();
        final int actual = 0;
        Assert.assertEquals("Error", expected, actual);
    }

    @Test
    public void testSubSequance() {
        final int start = CharSequenceTest.random(this.test2.length() - 1);
        final int end = CharSequenceTest.random(this.test2.length() - 1 - start) + start;
        final CharSequence result = this.test2.subSequence(start, end);
        Assert.assertNotNull("Reversed string isn't null", result);
    }
}
