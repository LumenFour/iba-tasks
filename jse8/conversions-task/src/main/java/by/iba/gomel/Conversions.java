package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Conversions.
 */
public final class Conversions {

    public static final int     NUMBERTWO   = 2;
    public static final int     ONETHOUSAND = 1000;

    private static final Logger LOGGER      = LoggerFactory.getLogger(Conversions.class);

    /**
     * Instantiates a new conversions.
     */
    private Conversions() {
    }

    /**
     * Prim convert to byte.
     *
     * @param b
     *            the b
     * @return the byte
     */
    public static byte primConvertToByte(final byte b) {
        short result;
        result = (short) ((b + Conversions.ONETHOUSAND) - Conversions.NUMBERTWO);
        Conversions.LOGGER.info("Byte {}\n", result);
        return (byte) result;
    }

    /**
     * Prim convert to int.
     *
     * @param i
     *            the i
     * @return the int
     */
    public static int primConvertToInt(final int i) {
        short res;
        res = (short) ((i + Conversions.ONETHOUSAND) + Conversions.NUMBERTWO);
        Conversions.LOGGER.info("Int {}\n", res);
        return res;
    }

    /**
     * Prim convert to long.
     *
     * @param l
     *            the l
     * @return the long
     */
    public static long primConvertToLong(final long l) {
        int r;
        r = (int) ((l + Conversions.ONETHOUSAND) * Conversions.NUMBERTWO);
        Conversions.LOGGER.info("Long {}", r);
        return r;
    }

}
