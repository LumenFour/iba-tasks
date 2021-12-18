package by.iba.gomel.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.FindAllWords;

public class FindAllWordsTest {

    @Test
    public void testComputeInitials() {
        final String sentenceTest1 = "Wealth is not his that has it, but his who enjoys it.";
        final String wordTest1 = "history";

        final String sentenceTest2 = "";
        final String wordTest2 = "";

        final String sentenceTest3 = "Empty word.";
        final String wordTest3 = "";

        final String sentenceTest4 = "";
        final String wordTest4 = "Empty sentence.";

        final String sentenceTest5 = "Nothing to show here.";
        final String wordTest5 = "alla";

        final String sentenceTest6 = "Need to come up something with limitations.";
        final String wordTest6 = "towithup";

        final List<String> expected1 = new ArrayList<>();
        expected1.add("his");
        expected1.add("is");

        final List<String> expected2 = new ArrayList<>();

        final List<String> expected3 = new ArrayList<>();

        final List<String> expected4 = new ArrayList<>();

        final List<String> expected5 = new ArrayList<>();

        final List<String> expected6 = new ArrayList<>();
        expected6.add("to");
        expected6.add("with");
        expected6.add("up");

        FindAllWords.printWords(sentenceTest1, wordTest1);
        Assert.assertEquals("test1", expected1, FindAllWords.printWords(sentenceTest1, wordTest1));
        FindAllWords.printWords(sentenceTest2, wordTest2);
        Assert.assertEquals("test2", expected2, FindAllWords.printWords(sentenceTest2, wordTest2));
        FindAllWords.printWords(sentenceTest3, wordTest3);
        Assert.assertEquals("test3", expected3, FindAllWords.printWords(sentenceTest3, wordTest3));
        FindAllWords.printWords(sentenceTest4, wordTest4);
        Assert.assertEquals("test4", expected4, FindAllWords.printWords(sentenceTest4, wordTest4));
        FindAllWords.printWords(sentenceTest5, wordTest5);
        Assert.assertEquals("test5", expected5, FindAllWords.printWords(sentenceTest5, wordTest5));
        FindAllWords.printWords(sentenceTest6, wordTest6);
        Assert.assertEquals("test6", expected6, FindAllWords.printWords(sentenceTest6, wordTest6));
    }
}
