package by.iba.gomel.tests;

import org.junit.Test;

import by.iba.gomel.LatinLetter;
import by.iba.gomel.NonLetterException;

public class ExceptionTest {

    @Test(expected = NonLetterException.class)
    public void testWrong() throws NonLetterException {
        final char[] testNeg = {'R', '&', 'f'};
        LatinLetter.getLatinLetters(testNeg);
    }

}
