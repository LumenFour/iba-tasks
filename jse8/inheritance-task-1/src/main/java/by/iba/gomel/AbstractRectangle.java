package by.iba.gomel;

/**
 * The Class AbstractRectangle.
 */
public abstract class AbstractRectangle implements Shape, Cloneable {

    private double length;

    /**
     * Gets the height.
     *
     * @param height
     *            the height
     * @return the height
     */
    public static double getHeight(final double height) {
        return height;
    }

    /**
     * Gets the length.
     *
     * @return the length
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Sets the length.
     *
     * @param length
     *            the new length
     */
    public void setLength(final double length) {
        this.length = length;
    }

    /**
     * Gets the width.
     *
     * @param width
     *            the length* @return the width
     */
    abstract double getWidth(double width);

}
