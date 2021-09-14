package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ArraySort;

public class ArraySortTest {

    public static int[] arrayOfInts() {
        final int[] myArray = {2, 5, 6, 1, 8, 4, 12, 10};
        return myArray;
    }

    @Test
    public void testArraySort() {
        final int[] twoDim = ArraySortTest.arrayOfInts();
        final int[] actual = ArraySort.arraySort(twoDim);
        final int[] expected = {1, 2, 4, 5, 6, 8, 10, 12};
        Assert.assertArrayEquals("Expected result of sorting array is true", expected, actual);
    }
}
