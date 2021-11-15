package by.iba.gomel;

/**
 * The Class Square.
 */
public class Square extends AbstractRectangle {

    public static final int THIRTYONE = 31;

    /**
     * Instantiates a new square.
     *
     * @param length
     *            the length
     * @param width
     *            the width
     */
    public Square(final double length) {
        super();
        super.setLength(length);
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getLength();
    }

    @Override
    public double getWidth(final double width) {
        return this.getLength();
    }

    @Override
    public String toString() {
        return "Square [side length=" + this.getLength() + "]";
    }

}
