package by.iba.gomel.tests;

import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Lessons;

public class LessonsTest {

    @Test
    public void testBreakTime() {
        final boolean expected1 = true;
        final boolean expected2 = false;

        final LocalTime testTime1 = LocalTime.of(9, 05);
        final LocalTime testTime2 = LocalTime.of(9, 25);

        Assert.assertEquals("test1", expected1, Lessons.checkIfBreakTime(testTime1));
        Assert.assertEquals("test2", expected2, Lessons.checkIfBreakTime(testTime2));
    }

}
