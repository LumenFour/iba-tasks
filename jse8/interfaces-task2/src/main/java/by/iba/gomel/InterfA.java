package by.iba.gomel;

import java.util.function.IntSupplier;

/**
 * The Interface InterfA. Extend "java.util.function.IntSupplier"
 */
public interface InterfA extends IntSupplier {

    /**
     * Test static Add parameter i.
     *
     * @param i
     *            the i
     * @return the int
     */
    static int testStatic(final int i) {
        return i;
    }

    /**
     * Test.
     *
     * @return the int
     */
    int test();

    /**
     * Test default. Add parameter i1
     *
     * @param i1
     *            the i 1
     * @return the int
     */
    default int testDefault(final int i1) {
        return i1;
    }
}
