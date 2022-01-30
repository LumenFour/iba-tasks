package by.iba.gomel;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class DateTime.
 */
public final class DateTime {

    private static final Logger LOGGER = LoggerFactory.getLogger(DateTime.class);

    /**
     * Instantiates a new date time.
     */
    private DateTime() {
    }

    /**
     * Determine working time.
     *
     * @param day
     *            the day
     * @return the duration
     */
    public static Duration determineWorkingTime(final LocalDate day) {

        LocalDate lastWorkingDayOfTheMonth = day.with(TemporalAdjusters.lastDayOfMonth());

        if ((lastWorkingDayOfTheMonth.getDayOfWeek() == DayOfWeek.SATURDAY)
                || (lastWorkingDayOfTheMonth.getDayOfWeek() == DayOfWeek.SUNDAY)) {
            lastWorkingDayOfTheMonth = day.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        }

        Duration scheduleThatDay;
        final LocalDateTime eight = LocalDateTime.of(2022, Month.JULY, 9, 8, 0);
        final LocalDateTime three = LocalDateTime.of(2022, Month.JULY, 9, 15, 0);
        final LocalDateTime seven = LocalDateTime.of(2022, Month.JULY, 9, 19, 0);

        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            scheduleThatDay = Duration.ZERO;
        } else if (day.getDayOfWeek().equals(DayOfWeek.SATURDAY)
                || (day.getDayOfMonth() == lastWorkingDayOfTheMonth.getDayOfMonth())) {
            scheduleThatDay = Duration.between(eight, three);
        } else {
            scheduleThatDay = Duration.between(eight, seven);
        }
        DateTime.LOGGER.info("{}\n", scheduleThatDay);
        return scheduleThatDay;
    }
}
