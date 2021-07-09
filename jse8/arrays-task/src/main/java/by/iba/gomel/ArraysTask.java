package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ArraysTask.
 */
public final class ArraysTask {

    public static final int     NUMBERTWO   = 2;
    public static final int     NUMBERTHREE = 3;
    public static final int     NUMBERONE   = 1;

    private static final Logger LOGGER      = LoggerFactory.getLogger(ArraysTask.class);

    /**
     * Instantiates a new arrays task.
     */
    private ArraysTask() {
    }

    /**
     * In this method array of numbers is initialized by assigning values for each element.
     */
    public static void assignedarray() {
        final int[][][] nums = new int[ArraysTask.NUMBERTHREE][ArraysTask.NUMBERTWO][ArraysTask.NUMBERTWO];
        nums[0][1][1] = ArraysTask.NUMBERTWO;
        nums[1][0][0] = ArraysTask.NUMBERTHREE;
        nums[1][1][0] = ArraysTask.NUMBERONE;
        ArraysTask.LOGGER.info("Assigned array: ");
        for (final int[][] array2D : nums) {
            for (final int[] array1D : array2D) {
                for (final int num : array1D) {
                    ArraysTask.LOGGER.info("{}", num);
                }
            }
        }
    }

    /**
     * In this method array of array of chars is initialized by assigning values for each element.
     */
    public static void assignedarrayofchars() {
        final char[][] chrs = new char[ArraysTask.NUMBERTHREE][];
        chrs[0] = new char[] {'d', 'e', 'c', 'a'};
        chrs[1] = new char[] {'a', 't', 'g'};
        chrs[ArraysTask.NUMBERTWO] = new char[] {'s'};
        ArraysTask.LOGGER.info("\nAssigned array of chars: ");
        for (final char[] chr : chrs) {
            for (final char element : chr) {
                ArraysTask.LOGGER.info("{}", element);
            }
        }
    }

    /**
     * In this method array of numbers is initialized when declared.
     */
    public static void declaredarray() {
        final int[][][] a = {{{0, 0, 0}, {2, 3, 0}}, {{1, 0, 0, 0}, {0}, {0}}};
        ArraysTask.LOGGER.info("\nDeclared array: ");
        for (final int[][] array2D : a) {
            for (final int[] array1D : array2D) {
                for (final int item : array1D) {
                    ArraysTask.LOGGER.info("{}", item);

                }
            }
        }
    }

    /**
     * In this method array of array of chars is initialized when declared.
     */
    public static void declaredarrayofchars() {
        final char[][][] chrz = {{{'d', 'e', 'c', 'a'}}, {{'a', 't', 'g'}, {'i'}}};
        ArraysTask.LOGGER.info("\nDeclared array of chars: ");
        for (final char[][] array2D : chrz) {
            for (final char[] array1D : array2D) {
                for (final char rz : array1D) {
                    ArraysTask.LOGGER.info("{}", rz);
                }
            }
        }
    }
}
