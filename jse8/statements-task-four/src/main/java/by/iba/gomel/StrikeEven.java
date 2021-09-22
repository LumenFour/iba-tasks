package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class StrikeEven.
 */
public final class StrikeEven {

    private static final Logger LOGGER    = LoggerFactory.getLogger(StrikeEven.class);

    public static final int     NUMBERTEN = 10;
    public static final int     NUMBERTWO = 2;

    /**
     * Instantiates a new strike even.
     */
    private StrikeEven() {
    }

    /**
     * Delete even elements.
     *
     * @param z
     *            the z
     * @return the int
     */
    public static int deleteEvenElements(int z) {
        int output = 0;
        int count = 0;
        while (z != 0) {
            if (((z % StrikeEven.NUMBERTEN) % StrikeEven.NUMBERTWO) != 0) {
                output += (z % StrikeEven.NUMBERTEN) * Math.pow(StrikeEven.NUMBERTEN, count);
                ++count;
            }
            z /= StrikeEven.NUMBERTEN;
        }
        StrikeEven.LOGGER.info("Removal result: {}", output);
        return output;
    }

}
