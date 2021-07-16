package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ArithmeticsDemo.
 */
public final class ArithmeticsDemo {

    public static final int     NUMBERONE   = 1;
    public static final int     NUMBERTWO   = 2;
    public static final int     NUMBERSEVEN = 7;
    public static final int     NUMBEREIGHT = 8;

    private static final Logger LOGGER      = LoggerFactory.getLogger(ArithmeticsDemo.class);

    /**
     * Instantiates a new arithmetics demo.
     */
    private ArithmeticsDemo() {
    }

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        int result = ArithmeticsDemo.NUMBERONE;
        result += ArithmeticsDemo.NUMBERTWO;
        ArithmeticsDemo.LOGGER.info("Add 2 and get {}\n", result);
        result -= ArithmeticsDemo.NUMBERONE;
        ArithmeticsDemo.LOGGER.info("Subtract 1 and get {}\n", result);
        result *= ArithmeticsDemo.NUMBERTWO;
        ArithmeticsDemo.LOGGER.info("Multiply by 2 and get {}\n", result);
        result /= ArithmeticsDemo.NUMBERTWO;
        ArithmeticsDemo.LOGGER.info("Divinde by 2 and get {}\n", result);
        result += ArithmeticsDemo.NUMBEREIGHT;
        result %= ArithmeticsDemo.NUMBERSEVEN;
        ArithmeticsDemo.LOGGER.info("Get the remainder of division by eight equal to {}", result);
    }

}
