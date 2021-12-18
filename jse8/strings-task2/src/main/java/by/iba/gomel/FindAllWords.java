package by.iba.gomel;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class FindAllWords.
 */
public final class FindAllWords {

    private static final Logger LOGGER = LoggerFactory.getLogger(FindAllWords.class);

    /**
     * Instantiates a new find all words.
     */
    private FindAllWords() {
    }

    /**
     * Find all words.
     *
     * @param sentence
     *            the sentence
     * @param givenWord
     *            the given word
     * @return the list
     */
    public static List<String> findAllWords(final String sentence, final String givenWord) {
        final List<String> results = new ArrayList<>();
        if (sentence.isEmpty()) {
            FindAllWords.LOGGER.info("Sentence is empty.\n");
        }
        if (givenWord.isEmpty()) {
            FindAllWords.LOGGER.info("Given word is empty.\n");
        } else {
            final int lengthOfTheWord = givenWord.length();
            for (int i = 0; i < lengthOfTheWord; i++) {
                for (int j = 1; j < ((lengthOfTheWord - i) + 1); j++) {
                    final String checkSequence = givenWord.substring(i, i + j);
                    FindAllWords.findSequence(sentence, checkSequence, results);
                }
            }
        }
        return results;
    }

    /**
     * Find sequence.
     *
     * @param sentence
     *            the sentence
     * @param checkSequence
     *            the check sequence
     * @param results
     *            the results
     */
    public static void findSequence(final String sentence, final String checkSequence,
            final List<String> results) {
        if (sentence.startsWith(checkSequence + " ")) {
            results.add(checkSequence);
        }
        if (sentence.contains(" " + checkSequence + " ")) {
            results.add(checkSequence);
        }
        if (sentence.endsWith(checkSequence + " ")) {
            results.add(checkSequence);
        }
    }

    /**
     * Prints the words.
     *
     * @param sentence
     *            the sentence
     * @param givenWord
     *            the given word
     * @return the list
     */
    public static List<String> printWords(final String sentence, final String givenWord) {
        FindAllWords.LOGGER.info("Sentence: {}\n", sentence);
        FindAllWords.LOGGER.info("Given word: {}\n", givenWord);
        FindAllWords.LOGGER.info("Found words:\n");
        final List<String> wordsToPrint = FindAllWords.findAllWords(sentence, givenWord);
        if (wordsToPrint.isEmpty()) {
            FindAllWords.LOGGER.info("No words were found.\n");
        } else {
            for (final String word : wordsToPrint) {
                FindAllWords.LOGGER.info("{}\n", word);
            }
        }
        return wordsToPrint;
    }
}
