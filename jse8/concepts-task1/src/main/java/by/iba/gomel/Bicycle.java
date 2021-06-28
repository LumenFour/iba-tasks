package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Bicycle.
 */
public class Bicycle {
    private static final Logger LOGGER = LoggerFactory.getLogger(Bicycle.class);
    private int                 cadence;
    private int                 speed;

    Bicycle(final int cadence, final int speed) {
        this.cadence = cadence;
        this.speed = speed;
    }

    /**
     * Change cadence.
     *
     * @param newValue
     *            the new value
     */
    public void changeCadence(final int newValue) {
        this.cadence = newValue;
    }

    /**
     * Speed up.
     *
     * @param increment
     *            the increment
     */
    public void speedUp(final int increment) {
        this.speed += increment;
    }

    /**
     * Prints the bicycle states.
     */
    void printBicycleStates() {
        Bicycle.LOGGER.info("Cadence set to {}. Speed set to {}. ", this.cadence, this.speed);
    }
}
