package by.iba.gomel;

/**
 * The Interface Log.
 */
public interface Log {

    /**
     * Log. You cannot override the static method of the interface.
     *
     * @param level
     *            the level
     * @param message
     *            the message
     * @return the string
     */
    static String log(final String level, final String message) {
        return message + level;
    }

    /**
     * Log.
     *
     * @param message
     *            the message
     * @return the string
     */
    default String log(final String message) {
        return message;

    }
}
