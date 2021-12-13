package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Initials.
 */
public final class Initials {

    private static final Logger LOGGER = LoggerFactory.getLogger(Initials.class);

    /**
     * Instantiates a new initials.
     */
    private Initials() {
    }

    /**
     * Compute initials.
     *
     * @param fname
     *            the fname
     * @return the string[]
     */
    public static String[] computeInitials(final String fname) {
        Initials.LOGGER.info("Your full name: {}\n", fname);
        final String[] str = fname.split(" ");
        final int l = str.length;
        Initials.LOGGER.info("Your Short name: ");
        for (int i = 0; i < (l - 1); i++) {
            Initials.LOGGER.info("{}.{}", str[i].charAt(0), "");
        }
        final String str1 = str[l - 1];
        Initials.LOGGER.info("{}\n", str1);
        return str;
    }
}
