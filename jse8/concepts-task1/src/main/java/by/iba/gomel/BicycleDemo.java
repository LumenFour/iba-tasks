package by.iba.gomel;

/**
 * The Class BicycleDemo.
 */
public final class BicycleDemo {
    public static final int NUMBER_OF_CADENCE = 21;
    public static final int SPEEDSET          = 10;
    public static final int WEIGHTUP          = 3;
    public static final int CHANGEBRACKES     = 2;
    public static final int FRAMETYPE         = 2;
    public static final int BLOCKERTYPE       = 3;
    public static final int PEOPLE            = 2;
    public static final int CHANGESPEED       = 14;

    /**
     * Instantiates a new bicycle demo.
     */
    private BicycleDemo() {
    }

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final Bicycle bicycle = new Bicycle(11, 10);
        final MountainBike bike = new MountainBike(2, 1);
        final RoadBike roadBike = new RoadBike(1, 2);
        final TandemBike tandemBike = new TandemBike(1, 5);
        bicycle.changeCadence(BicycleDemo.NUMBER_OF_CADENCE);
        bicycle.speedUp(BicycleDemo.SPEEDSET);
        bicycle.printBicycleStates();
        bike.weightUp(BicycleDemo.WEIGHTUP);
        bike.changeBrackes(BicycleDemo.CHANGEBRACKES);
        bike.printMountainBikeStates();
        roadBike.frametype(BicycleDemo.FRAMETYPE);
        roadBike.changeblockertype(BicycleDemo.BLOCKERTYPE);
        roadBike.printRoadBikeStates();
        tandemBike.peoplecount(BicycleDemo.PEOPLE);
        tandemBike.changespeed(BicycleDemo.CHANGESPEED);
        tandemBike.printTandemBikeStates();
    }
}
