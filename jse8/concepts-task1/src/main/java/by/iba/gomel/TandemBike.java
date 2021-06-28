package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class TandemBike.
 */
public class TandemBike implements Torker {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoadBike.class);
    private int                 amount;
    private int                 value;

    TandemBike(final int amount, final int value) {
        this.amount = amount;
        this.value = value;
    }

    @Override
    public void changespeed(final int speed) {
        this.value += speed;
    }

    @Override
    public void peoplecount(final int count) {
        this.amount = count;
    }

    void printTandemBikeStates() {
        TandemBike.LOGGER.info("Amount of people set to {}. Speed set to {}. ", this.amount,
                this.value);
    }
}
