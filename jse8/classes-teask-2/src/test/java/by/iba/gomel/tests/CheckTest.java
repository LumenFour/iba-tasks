package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Check;

public class CheckTest {
    Check c = new Check();

    @Test
    public void testCheckSequence() {
        final boolean b1 = true;
        final boolean b2 = false;
        Assert.assertEquals("Error", b1, this.c.checkSequence(new int[] {1, 2, 3, 4, 5}));
        Assert.assertEquals("Error", b2, this.c.checkSequence(new int[] {1, 2, 4, 4, 5}));
    }

    @Test
    public void testCheckSequenceNeg() {
        final boolean b1 = false;
        final boolean b2 = false;
        Assert.assertEquals("Error", b1, this.c.checkSequence(new int[] {1, 2}));
        Assert.assertEquals("Error", b2, this.c.checkSequence(new int[] {1, 2}));
    }

}
