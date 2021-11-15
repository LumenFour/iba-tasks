package by.iba.gomel;

/**
 * The Class Rhombus.
 */
public class Rhombus extends AbstractRectangle {

    public static final double POINTFIVE = 0.5;
    public static final int    THIRTYONE = 31;
    private final double       firstdiagonal;
    private final double       seconddiagonal;

    /**
     * Instantiates a new rhombus.
     *
     * @param firstdiagonal
     *            the firstdiagonal
     * @param side
     *            the side
     * @param seconddiagonal
     *            the seconddiagonal
     */
    public Rhombus(final double firstdiagonal, final double side, final double seconddiagonal) {
        super();
        super.setLength(side);
        this.firstdiagonal = firstdiagonal;
        this.seconddiagonal = seconddiagonal;
    }

    @Override
    public double getArea() {
        return Rhombus.POINTFIVE * this.firstdiagonal * this.seconddiagonal;
    }

    @Override
    public double getWidth(final double width) {
        return this.firstdiagonal;
    }

    @Override
    public String toString() {
        return "Rhombus [firstdiagonal=" + this.firstdiagonal + ", seconddiagonal="
                + this.seconddiagonal + "]";
    }

}
