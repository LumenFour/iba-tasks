package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Name.
 */
public final class Name {

    private static final Logger LOGGER = LoggerFactory.getLogger(Name.class);

    private Name() {
    }

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        Name.LOGGER.info("Anton Marozau");
    }
}
