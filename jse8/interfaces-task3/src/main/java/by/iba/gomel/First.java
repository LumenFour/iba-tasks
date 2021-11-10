package by.iba.gomel;

/**
 * The Class First.
 */
public class First implements Log {

    /**
     * Log.
     *
     * @param level
     *            the level
     * @param message
     *            the message
     * @return the string
     */
    public static String log(final String level, final String message) {
        return message + level;

    }

    @Override
    public String log(final String message) {
        return Log.super.log(message);
    }

}
