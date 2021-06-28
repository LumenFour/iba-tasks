package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class RoadBike.
 */
public class RoadBike implements Stadsfiets {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoadBike.class);
    private int                 blocktype;
    private int                 numberoftype;

    RoadBike(final int blocktype, final int numberoftype) {
        this.blocktype = blocktype;
        this.numberoftype = numberoftype;
    }

    @Override
    public void changeblockertype(final int block) {
        this.blocktype = block;
    }

    @Override
    public void frametype(final int number) {
        this.numberoftype = number;
    }

    void printRoadBikeStates() {
        RoadBike.LOGGER.info("Frame set to {}. Block set to {}. ", this.numberoftype,
                this.blocktype);
    }
}
