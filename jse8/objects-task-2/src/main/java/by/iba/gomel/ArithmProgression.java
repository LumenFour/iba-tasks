package by.iba.gomel;

/**
 * ArithmProgression class implements an arithmetic sequence in which each next member can be found
 * by adding the same number(step) to the previous one.
 */
public class ArithmProgression {

    private static int      count;
    public static final int NUMBERTWO = 2;
    private final int       num;
    private final int       step;
    private final int       first;

    private final int       last;

    /**
     * Instantiates a new arithm progression.
     *
     * @param first
     *            the first
     * @param step
     *            the step
     * @param number
     *            the number
     */
    public ArithmProgression(final int first, final int step, final int number) {
        this.first = first;
        this.step = step;
        this.num = number;
        this.last = this.getValueByNum(number);
        ArithmProgression.count++;
    }

    public static int getCount() {
        return ArithmProgression.count;
    }

    public int getFirst() {
        return this.first;
    }

    public int getLast() {
        return this.last;
    }

    public int getNum() {
        return this.num;
    }

    public int getStep() {
        return this.step;
    }

    public int getSum() {
        return ((this.first + this.last) / ArithmProgression.NUMBERTWO) * this.num;
    }

    /**
     * getValueById method
     *
     * @param n
     *            input parameter
     * @return integer
     */
    public final int getValueByNum(final int n) {
        return this.first + (this.step * (n - 1));
    }
}
