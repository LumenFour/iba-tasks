package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class OperatorsShift.
 */
public final class OperatorsShift {

    public static final int     NUMBERTWO      = 2;
    public static final int     NUMBERTHREE    = 3;
    public static final int     BINARYPOSITIVE = 0b011;
    public static final int     BINARYNEGATIVE = -0b111;

    private static final Logger LOGGER         = LoggerFactory.getLogger(OperatorsShift.class);

    /**
     * Instantiates a new operators shift.
     */
    private OperatorsShift() {
    }

    /**
     * Left shift negative.
     *
     * @return the int
     */
    public static int leftShiftNegative() {
        final int value = (byte) OperatorsShift.BINARYNEGATIVE;
        int ress;
        ress = value << OperatorsShift.NUMBERTHREE;
        OperatorsShift.LOGGER.info("\nВыводим ress после сдвига влево ");
        return ress;
    }

    /**
     * Left shift positive.
     *
     * @return the int
     */
    public static int leftShiftPositive() {
        final int val = (byte) OperatorsShift.BINARYPOSITIVE;
        int res;
        res = val << OperatorsShift.NUMBERTWO;
        OperatorsShift.LOGGER.info("Выводим res после сдвига влево ");
        return res;
    }

    /**
     * Right shift negative.
     *
     * @return the int
     */
    public static int rightShiftNegative() {
        final int value = (byte) OperatorsShift.BINARYNEGATIVE;
        int result;
        result = value >> OperatorsShift.NUMBERTHREE;
        OperatorsShift.LOGGER.info("\nВыводим result после сдвига вправо ");
        return result;
    }

    /**
     * Right shift positive.
     *
     * @return the int
     */
    public static int rightShiftPositive() {
        final int val = (byte) OperatorsShift.BINARYPOSITIVE;
        int rez;
        rez = val >> OperatorsShift.NUMBERTWO;
        OperatorsShift.LOGGER.info("\nВыводим rez после сдвига вправо ");
        return rez;
    }

    /**
     * Unsigned right shift positive.
     *
     * @return the int
     */
    public static int unsignedRightShiftPositive() {
        final int val = (byte) OperatorsShift.BINARYPOSITIVE;
        int r;
        r = val >>> OperatorsShift.NUMBERTHREE;
        OperatorsShift.LOGGER.info("\nВыводим r после беззнакового сдвига вправо ");
        return r;
    }
}
