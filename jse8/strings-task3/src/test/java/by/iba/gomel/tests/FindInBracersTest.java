package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.FindInBracers;

public class FindInBracersTest {

    @Test
    public void testComputeInitials() {
        final String sentence = "word1 {word2 (word3) word4} word5";

        final String actual = FindInBracers.getSubsentences(sentence);

        final String expected = "word1 {word2 (word3) word4} word5";

        Assert.assertEquals("test", actual, expected);
    }

}
