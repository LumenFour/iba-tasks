package by.iba.gomel.tests;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Museum;

public class MuseumTest {

    @Test
    public void testGetToMuseumInTime() {

        final boolean expected1 = true;
        final boolean expected2 = false;
        final boolean expected3 = true;

        final ZonedDateTime testDate1 = ZonedDateTime.of(LocalDate.parse("2022-02-02"),
                LocalTime.parse("18:00:00"), ZoneId.of("America/New_York"));

        Assert.assertEquals("test1", expected1, Museum.checkIfGetInTime(testDate1));

        final ZonedDateTime testDate2 = ZonedDateTime.of(LocalDate.parse("2022-02-04"),
                LocalTime.parse("09:00:00"), ZoneId.of("Europe/Minsk"));

        Assert.assertEquals("test2", expected2, Museum.checkIfGetInTime(testDate2));

        final ZonedDateTime testDate3 = ZonedDateTime.of(LocalDate.parse("2022-02-02"),
                LocalTime.parse("12:06:00"), ZoneId.of("Europe/Moscow"));

        Assert.assertEquals("test3", expected3, Museum.checkIfGetInTime(testDate3));

    }

}
