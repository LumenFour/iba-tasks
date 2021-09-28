package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ArithmProgression;

public class ArithmProgressionTest {

    @Test
    public void testGetCount() {
        Assert.assertEquals("Error", 0, ArithmProgression.getCount());
    }

    @Test
    public void testGetCurrent() {
        final ArithmProgression ap = new ArithmProgression(3, 4, 7);
        Assert.assertEquals("Error", 27, ap.getLast());

    }

    @Test
    public void testGetFirst() {
        final ArithmProgression ap = new ArithmProgression(3, 4, 7);
        Assert.assertEquals("Error", 3, ap.getFirst());
    }

    @Test
    public void testGetNum() {
        final ArithmProgression ap = new ArithmProgression(3, 4, 7);
        Assert.assertEquals("Error", 7, ap.getNum());
    }

    @Test
    public void testGetStep() {
        final ArithmProgression ap = new ArithmProgression(3, 4, 7);
        Assert.assertEquals("Error", 4, ap.getStep());
    }

    // Several objects
    @Test
    public void testGetSum() {
        final ArithmProgression ap1 = new ArithmProgression(3, 4, 7);
        final ArithmProgression ap2 = new ArithmProgression(1, 2, 3);
        Assert.assertEquals("Error", 105, ap1.getSum());
        Assert.assertEquals("Error", 9, ap2.getSum());
    }

    @Test
    public void testGetValueByNum() {
        final ArithmProgression ap = new ArithmProgression(3, 4, 7);
        Assert.assertEquals("Error", 19, ap.getValueByNum(5));
    }

}
