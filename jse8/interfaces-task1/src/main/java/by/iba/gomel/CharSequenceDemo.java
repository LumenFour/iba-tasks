package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class CharSequanceDemo.
 */
public class CharSequenceDemo implements CharSequence {

    public static final int     ONE    = 1;

    private static final Logger LOGGER = LoggerFactory.getLogger(CharSequence.class);

    private final String        charSequence;

    /**
     * Instantiates a new char sequence demo.
     *
     * @param charSequence
     *            the char sequence
     */
    public CharSequenceDemo(final String charSequence) {
        this.charSequence = charSequence;
    }

    @Override
    public char charAt(final int index) {
        return 0;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public CharSequence subSequence(final int start, final int end) {
        final StringBuilder sub = new StringBuilder(
                this.charSequence.subSequence(this.fromEnd(end), this.fromEnd(start)));
        CharSequenceDemo.LOGGER.info("String inverted");
        return sub.reverse();
    }

    /**
     * From end.
     *
     * @param i
     *            the i
     * @return the int
     */
    private int fromEnd(final int i) {
        return this.charSequence.length() - CharSequenceDemo.ONE - i;
    }

}
