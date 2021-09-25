package by.iba.gomel;

/**
 * Type class
 */
public class Type {
    /**
     * typeOf method
     *
     * @param b
     *            input parameter
     * @return String
     */
    public String typeOf(final byte b) {
        return b + "-> byte\n";
    }

    /**
     * typeOf method
     *
     * @param c
     *            input parameter
     * @return String
     */
    public String typeOf(final char c) {
        return c + "-> char\n";
    }

    /**
     * typeOf method
     *
     * @param d
     *            input parameter
     * @return String
     */
    public String typeOf(final double d) {
        return d + "-> double\n";
    }

    /**
     * typeOf method
     *
     * @param f
     *            input parameter
     * @return String
     */
    public String typeOf(final float f) {
        return f + "-> float\n";
    }

    /**
     * typeOf method
     *
     * @param i
     *            input parameter
     * @return String
     */
    public String typeOf(final int i) {
        return i + "-> integer\n";
    }

    /**
     * typeOf method
     *
     * @param s
     *            input parameter
     * @return String
     */
    public String typeOf(final String s) {
        return s + "-> string\n";
    }
}
