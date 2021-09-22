package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.StrikeEven;

public class StrikeEvenTest {

    @Test
    public void testDeleteEvenElements() {
        final int number = 12345678;
        final int result = StrikeEven.deleteEvenElements(number);
        Assert.assertEquals("Error", 1357, result);
    }
}
