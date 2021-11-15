package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ShapeController.
 */
public class ShapeController {
    private static final int    TWO       = 2;
    private static final int    THREE     = 3;
    private static final int    FOUR      = 4;
    private static final int    FIVE      = 5;
    private static final int    SEVEN     = 7;
    private static final int    TEN       = 10;
    private static final int    TWELVE    = 12;
    private static final int    THIRTEEN  = 13;
    private static final int    EIGHTEEN  = 18;
    private static final int    SEVENTEEN = 11;

    private static final Logger LOGGER    = LoggerFactory.getLogger(ShapeController.class);

    private Shape[]             shapes;

    /**
     * Instantiates a new shape controller.
     */
    public ShapeController() {
        this.init();
    }

    /**
     * Instantiates a new shape controller.
     *
     * @param initarr
     *            the initialized shapes array
     */
    public ShapeController(final Shape[] initarr) {
        if ((initarr != null) && (initarr.length > 0)) {
            this.shapes = initarr.clone();
            ShapeController.LOGGER
                    .info("Array member of ShapeController is initialized, but empty.\n");
        }
    }

    /**
     * Method that initializes shapes and fill with all 5 Shapes: 1 Circle, 2 Squares, 2 Rhombus.
     */
    public final void init() {
        this.shapes = new Shape[ShapeController.FIVE];
        this.shapes[0] = new Circle(ShapeController.TWELVE);
        this.shapes[1] = new Square(ShapeController.FIVE);
        this.shapes[ShapeController.TWO] = new Square(ShapeController.SEVEN);
        this.shapes[ShapeController.THREE] = new Rhombus(ShapeController.THIRTEEN,
                ShapeController.FIVE, ShapeController.TWELVE);
        this.shapes[ShapeController.FOUR] = new Rhombus(ShapeController.EIGHTEEN,
                ShapeController.TEN, ShapeController.SEVENTEEN);
    }

    /**
     * Method that sums all areas.
     *
     * @return sum Double value.
     */
    public final double sum() {
        double sum = 0;
        for (final Shape shape : this.shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}
