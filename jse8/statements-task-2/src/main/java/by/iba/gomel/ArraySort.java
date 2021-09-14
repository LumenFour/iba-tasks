package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ArraySort.
 */
public final class ArraySort {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArraySort.class);

    /**
     * Instantiates a new array sort.
     */
    private ArraySort() {
    }

    /**
     * Array sort.
     *
     * @param array
     *            the array
     * @return the int[]
     */
    public static int[] arraySort(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j] < array[j - 1]) {
                    ArraySort.swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
        ArraySort.LOGGER.info("Sorted array: {}\n", array);
        return array;
    }

    /**
     * Swap.
     *
     * @param array
     *            the array
     * @param i
     *            the i
     * @param j
     *            the j
     */
    public static void swap(final int[] array, final int i, final int j) {
        final int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
