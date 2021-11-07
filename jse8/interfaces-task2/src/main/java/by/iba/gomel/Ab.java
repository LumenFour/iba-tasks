package by.iba.gomel;

/**
 * The Class Ab implements both of the interfaces.
 */
public class Ab implements InterfA, InterfB {

    public static final int FIVETEEN = 15;

    @Override
    public int getAsInt() {
        return 0;
    }

    @Override
    public int test() {
        return 0;
    }

    @Override
    public int testDefault(final int i1) {
        return InterfA.super.testDefault(i1);
    }

    /**
     * Test static.
     *
     * @return the int
     */
    public int testStatic() {
        return Ab.FIVETEEN;
    }

}
