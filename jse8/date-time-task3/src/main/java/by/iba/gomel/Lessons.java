package by.iba.gomel;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Lessons.
 */
public final class Lessons {

    private static final LocalTime lessonsStartAt = LocalTime.of(8, 20);

    private static final LocalTime lessonLasts    = LocalTime.of(0, 45);
    private static final LocalTime breakLasts     = LocalTime.of(0, 10);

    private static final Locale    enUs           = new Locale("en-US");
    private static final Logger    LOGGER         = LoggerFactory.getLogger(Lessons.class);

    /**
     * Instantiates a new lessons.
     */
    private Lessons() {
    }

    /**
     * Check if break time.
     *
     * @param givenTime
     *            the given time
     * @return true, if successful
     */
    public static boolean checkIfBreakTime(final LocalTime givenTime) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a", Lessons.enUs);
        final String formatTimeGiven = givenTime.format(formatter);

        Lessons.LOGGER.info("Current time: {}\n", formatTimeGiven);

        LocalTime temp = LocalTime.of(Lessons.lessonsStartAt.getHour(),
                Lessons.lessonsStartAt.getMinute());

        String formatTimeTemp;
        do {
            temp = temp.plusHours(Lessons.lessonLasts.getHour())
                    .plusMinutes(Lessons.lessonLasts.getMinute());

            formatTimeTemp = temp.format(formatter);

            if (givenTime.isBefore(temp)) {
                Lessons.LOGGER.info("Break starts at: {}\n", formatTimeTemp);
                Lessons.LOGGER.info("It's a lesson now.\n\n");
                return false;
            }

            temp = temp.plusHours(Lessons.breakLasts.getHour())
                    .plusMinutes(Lessons.breakLasts.getMinute());

            formatTimeTemp = temp.format(formatter);

            if (givenTime.isBefore(temp)) {
                Lessons.LOGGER.info("Lesson starts at: {}\n", formatTimeTemp);
                Lessons.LOGGER.info("It's a break time now.\n\n");
                return true;
            }
        } while (temp.isBefore(givenTime));
        return false;
    }
}
