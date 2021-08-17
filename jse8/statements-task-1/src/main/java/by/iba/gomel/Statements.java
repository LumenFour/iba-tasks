package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Statements.
 */

public final class Statements {

    /** The Constant NUMBERZERO. */
    public static final int     NUMBERZERO = 0;

    /** The Constant LOGGER. */
    private static final Logger LOGGER     = LoggerFactory.getLogger(Statements.class);

    /**
     * Instantiates a new statements.
     */
    private Statements() {
    }

    /**
     * Check columns.
     *
     * @param twoDimArray
     *            the two dim array
     * @return true, if successful
     */
    public static boolean checkColumns(final char[][] twoDimArray) {
        boolean checkCol = true;
        for (int j = 0; j < twoDimArray[0].length; j++) {
            for (final char[] element : twoDimArray) {
                if (twoDimArray[0][j] == element[j]) {
                    checkCol = true;
                } else {
                    checkCol = false;
                    break;
                }
            }
            if (checkCol) {
                Statements.LOGGER.info("Checking completed: {}\n", checkCol);
                return true;
            }
        }
        Statements.LOGGER.info("Checking columns: {}\n", checkCol);
        return checkCol;
    }

    /**
     * Check diagonal.
     *
     * @param twoDimArray
     *            the two dim array
     * @return true, if successful
     */
    public static boolean checkDiagonal(final char[][] twoDimArray) {
        boolean checkDiag = true;
        for (int i = 0; i < twoDimArray.length; i++) {
            if (twoDimArray[i][i] == twoDimArray[0][0]) {
                checkDiag = true;
            } else {
                checkDiag = false;
            }
        }
        Statements.LOGGER.info("Checking diagonal: {}\n", checkDiag);
        return checkDiag;
    }

    /**
     * Check row.
     *
     * @param twoDimArray
     *            the two dim array
     * @return true, if successful
     */
    public static boolean checkRow(final char[][] twoDimArray) {
        boolean checkRow = true;
        for (final char[] element : twoDimArray) {
            for (final char element2 : element) {
                if (element[0] == element2) {
                    checkRow = true;
                } else {
                    checkRow = false;
                    break;
                }
            }
            if (checkRow) {
                Statements.LOGGER.info("Checking completed: {}\n", checkRow);
                return true;
            }
        }
        Statements.LOGGER.info("Checking rows: {}\n", checkRow);
        return checkRow;
    }
}
