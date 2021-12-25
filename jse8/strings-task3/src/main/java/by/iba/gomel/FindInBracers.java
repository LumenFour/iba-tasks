package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class FindInBracers.
 */
public final class FindInBracers {

    private static final Logger    LOGGER            = LoggerFactory.getLogger(FindInBracers.class);

    private static boolean         startRoundFound;
    private static boolean         endRoundFound;
    private static boolean         startSquareFound;
    private static boolean         endSquareFound;
    private static boolean         startFigureFound;
    private static boolean         endFigureFound;

    private static volatile String roundBracesWords  = "";
    private static volatile String squareBracesWords = "";
    private static volatile String figureBracesWords = "";

    /**
     * Instantiates a new find in bracers.
     */
    private FindInBracers() {
    }

    /**
     * Check bracers.
     *
     * @param braces
     *            the braces
     */
    public static void checkBracers(final String braces) {
        String foundWords = "";
        boolean start = false;
        boolean end = false;
        switch (braces) {
            case "()":
                foundWords = FindInBracers.roundBracesWords;
                start = FindInBracers.startRoundFound;
                end = FindInBracers.endRoundFound;
                break;
            case "[]":
                foundWords = FindInBracers.squareBracesWords;
                start = FindInBracers.startSquareFound;
                end = FindInBracers.endSquareFound;
                break;
            case "{}":
                foundWords = FindInBracers.figureBracesWords;
                start = FindInBracers.startFigureFound;
                end = FindInBracers.endFigureFound;
                break;
            default:
                break;
        }

        FindInBracers.LOGGER.info("Words between {} braces: \n", braces);
        if (start && end) {
            String output;
            if (foundWords.charAt(foundWords.length() - 1) == ' ') {
                output = foundWords.substring(1, foundWords.length() - 1).replaceAll("\\s+", " ");
            } else {
                output = foundWords.substring(1, foundWords.length()).replaceAll("\\s+", " ");
            }
            FindInBracers.LOGGER.info("{}\n", output);
        } else {
            FindInBracers.LOGGER.info("{}\n", braces);
        }
        if (foundWords.isEmpty()) {
            FindInBracers.LOGGER.info("No words were found.\n");
        }
    }

    /**
     * Gets the subsentences.
     *
     * @param sentence
     *            the sentence
     * @return the subsentences
     */
    public static String getSubsentences(final String sentence) {
        FindInBracers.roundBracesWords = "";
        FindInBracers.squareBracesWords = "";
        FindInBracers.figureBracesWords = "";
        final char[] charArray = sentence.toCharArray();
        for (final char c : charArray) {
            switch (c) {
                case '(':
                    FindInBracers.startRoundFound = true;
                    FindInBracers.referCharacter(' ');
                    break;
                case ')':
                    FindInBracers.endRoundFound = true;
                    FindInBracers.referCharacter(' ');
                    break;
                case '[':
                    FindInBracers.startSquareFound = true;
                    FindInBracers.referCharacter(' ');
                    break;
                case ']':
                    FindInBracers.endSquareFound = true;
                    FindInBracers.referCharacter(' ');
                    break;
                case '{':
                    FindInBracers.startFigureFound = true;
                    FindInBracers.referCharacter(' ');
                    break;
                case '}':
                    FindInBracers.endFigureFound = true;
                    FindInBracers.referCharacter(' ');
                    break;
                default:
                    FindInBracers.referCharacter(c);
                    break;
            }
        }
        FindInBracers.LOGGER.info("Sentence: {}\n", sentence);
        FindInBracers.checkBracers("()");
        FindInBracers.checkBracers("[]");
        FindInBracers.checkBracers("{}");
        return sentence;
    }

    /**
     * Refer character.
     *
     * @param c
     *            the c
     */
    public static void referCharacter(final char c) {
        if (FindInBracers.startRoundFound && !FindInBracers.endRoundFound) {
            FindInBracers.roundBracesWords += Character.toString(c);
        }
        if (FindInBracers.startSquareFound && !FindInBracers.endSquareFound) {
            FindInBracers.squareBracesWords += Character.toString(c);
        }
        if (FindInBracers.startFigureFound && !FindInBracers.endFigureFound) {
            FindInBracers.figureBracesWords += Character.toString(c);
        }
    }

}
