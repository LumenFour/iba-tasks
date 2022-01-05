package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class LatinLetter.
 */
public final class LatinLetter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LatinLetter.class);

    /**
     * Instantiates a new latin letter.
     */
    private LatinLetter() {
    }

    /**
     * Gets the latin letters.
     *
     * @param ch
     *            the ch
     * @return the latin letters
     * @throws NonLetterException
     *             the non letter exception
     */
    public static void getLatinLetters(final char[] ch) throws NonLetterException {
        try {
            LatinLetter.LOGGER.info("Start checking if all letters are the Latin ones.\n");
            for (final char let : ch) {
                if (((let >= 'A') && (let <= 'Z')) || ((let >= 'a') && (let <= 'z'))) {
                    LatinLetter.LOGGER.info("Letter {} is a Latin one\n", let);
                } else {
                    throw new NonLetterException(let);
                }
            }
        } finally {
            LatinLetter.LOGGER.info("End of the checking.\n");
        }
    }
}
