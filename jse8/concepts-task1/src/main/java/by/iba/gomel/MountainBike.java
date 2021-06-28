package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class MountainBike.
 */
public class MountainBike implements CrossCountry {
    private static final Logger LOGGER = LoggerFactory.getLogger(MountainBike.class);
    private int                 weight;
    private int                 brackes;

    MountainBike(final int weight, final int brackes) {
        this.weight = weight;
        this.brackes = brackes;
    }

    @Override
    public void changeBrackes(final int change) {
        this.brackes = change;
    }

    @Override
    public void weightUp(final int up) {
        this.weight += up;
    }

    void printMountainBikeStates() {
        MountainBike.LOGGER.info("Weight set to {}. Brackes set to {}. ", this.weight,
                this.brackes);
    }
}
