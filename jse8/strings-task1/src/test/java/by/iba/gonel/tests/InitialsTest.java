package by.iba.gonel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Initials;

public class InitialsTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testComputeInitials() {

        final String[] actual1 = Initials.computeInitials("Anton Marozau");
        final String[] actual2 = Initials.computeInitials("");
        final String[] actual3 = Initials.computeInitials("A B");
        final String[] actual4 = Initials.computeInitials("Aaa ");
        final String[] actual5 = Initials.computeInitials("Bbb ");

        final String[] expected1 = {"Anton", "Marozau"};
        final String[] expected2 = {""};
        final String[] expected3 = {"A", "B"};
        final String[] expected4 = {"Aaa"};
        final String[] expected5 = {"Bbb"};

        Assert.assertArrayEquals("test1", actual1, expected1);
        Assert.assertArrayEquals("test2", expected2, actual2);
        Assert.assertArrayEquals("test3", expected3, actual3);
        Assert.assertArrayEquals("test4", expected4, actual4);
        Assert.assertArrayEquals("test5", expected5, actual5);
    }
}
