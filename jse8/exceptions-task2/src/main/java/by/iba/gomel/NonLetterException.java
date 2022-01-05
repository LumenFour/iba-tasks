package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class NonLetterException.
 */
@SuppressWarnings("serial")
public class NonLetterException extends Exception {

    private static final Logger LOGGER = LoggerFactory.getLogger(NonLetterException.class);

    /**
     * Instantiates a new non letter exception.
     */
    public NonLetterException() {
        super();
    }

    /**
     * Instantiates a new non letter exception.
     *
     * @param character
     *            the character
     */
    public NonLetterException(final char character) {
        super("Exception was caught:\nCharacter is not from Latin alphabet. "
                + Character.toString(character));
        this.printMessage();
    }

    /**
     * Prints the message.
     */
    private void printMessage() {
        NonLetterException.LOGGER.info("{}\n", this.getMessage());
    }
}
