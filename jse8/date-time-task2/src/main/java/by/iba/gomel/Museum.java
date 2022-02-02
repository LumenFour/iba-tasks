package by.iba.gomel;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Museum.
 */
public final class Museum {

    private static final LocalTime ClosesAtStandart = LocalTime.of(17, 30);
    private static final LocalTime ClosesAtExtra    = LocalTime.of(20, 30);

    private static final LocalTime GetFromMinsk     = LocalTime.of(3, 0);
    private static final int       GETTOAIRPORT     = 90;

    private static final Logger    LOGGER           = LoggerFactory.getLogger(Museum.class);

    /**
     * Instantiates a new museum.
     */
    private Museum() {
    }

    /**
     * Check if get in time.
     *
     * @param startDateTime
     *            the start date time
     * @return true, if successful
     */
    public static boolean checkIfGetInTime(final ZonedDateTime startDateTime) {

        boolean getInTime = false;
        String timeLeft;

        if (startDateTime.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            final ZonedDateTime dateSchedule = startDateTime
                    .withHour(Museum.ClosesAtExtra.getHour())
                    .withMinute(Museum.ClosesAtExtra.getMinute()).withSecond(0);
            timeLeft = Museum.getTimeLeft(startDateTime, dateSchedule);
            Museum.LOGGER.info("Time until museum closes: {}, tourist arrived on time\n\n",
                    timeLeft);
        } else {
            final ZonedDateTime dateSchedule = startDateTime
                    .withHour(Museum.ClosesAtStandart.getHour())
                    .withMinute(Museum.ClosesAtStandart.getMinute()).withSecond(0);
            timeLeft = Museum.getTimeLeft(startDateTime, dateSchedule);
            Museum.LOGGER.info("Museum is closed for: {}\n\n", timeLeft);
            getInTime = true;
        }

        return getInTime;
    }

    /**
     * Gets the time left.
     *
     * @param departureDate
     *            the departure date
     * @param dateSchedule
     *            the date schedule
     * @return the time left
     */
    private static String getTimeLeft(final ZonedDateTime departureDate,
            final ZonedDateTime dateSchedule) {

        final LocalTime timeToAdd = Museum.GetFromMinsk;

        final ZonedDateTime givenDate1 = departureDate.plusHours(timeToAdd.getHour());
        final ZonedDateTime givenDate2 = givenDate1.plusMinutes(timeToAdd.getMinute());
        final ZonedDateTime arrivalTime = givenDate2.plusMinutes(Museum.GETTOAIRPORT);

        final long numberOfHours = ChronoUnit.HOURS.between(arrivalTime, dateSchedule);
        final long numberOfMinutes = ChronoUnit.MINUTES.between(arrivalTime, dateSchedule)
                - TimeUnit.HOURS.toMinutes(numberOfHours);

        return String.format("%d hour(s) %d min(s)", numberOfHours, numberOfMinutes);
    }

}
