package by.iba.gomel.tests;

import java.time.Duration;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.DateTime;

public class DateTimeTest {

    @Test
    public void testMain() {
        // Weekdays
        Assert.assertEquals("test2", Duration.ofHours(11),
                DateTime.determineWorkingTime(LocalDate.of(2022, 1, 18)));
        Assert.assertEquals("test2", Duration.ofHours(11),
                DateTime.determineWorkingTime(LocalDate.of(2022, 1, 20)));
        Assert.assertEquals("test2", Duration.ofHours(11),
                DateTime.determineWorkingTime(LocalDate.of(2022, 1, 21)));
        // Saturday
        Assert.assertEquals("test3", Duration.ofHours(7),
                DateTime.determineWorkingTime(LocalDate.of(2022, 1, 29)));
        // Sunday
        Assert.assertEquals("test3", Duration.ofHours(0),
                DateTime.determineWorkingTime(LocalDate.of(2022, 1, 30)));
    }

}
