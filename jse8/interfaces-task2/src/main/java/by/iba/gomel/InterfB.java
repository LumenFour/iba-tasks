package by.iba.gomel;

import java.util.function.IntSupplier;

/**
 * The Interface InterfB. Extend "java.util.function.IntSupplier"
 */
public interface InterfB extends IntSupplier {

    /**
     * Test default. Add parameter i1.Cannot make a static reference to the non-static method
     * testDefault(int) from the type InterfB
     *
     * @param i1
     *            the i 1
     * @return the int
     */

    static int testDefault(final int i1) {
        return i1;
    }

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
}
