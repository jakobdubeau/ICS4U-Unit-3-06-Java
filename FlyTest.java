/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*/

/**
* FlyTest.
*/
final class FlyTest {
    /**
    * Constant.
    */
    public static final int TWOTWELVE = 212;

    /**
    * Constant.
    */
    public static final int FOURTWENTYTWO = 422;

    /**
    * Constant.
    */
    public static final int FOUR = 4;

    /**
    * Constant.
    */
    public static final int FIVETHOUSAND = 5000;

    /**
    * Prevent instantiation.
    *
    * @throws IllegalStateException
    *
    */
    private FlyTest() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Main.
    *
    * @param args this will not be used.
    */
    public static void main(String[] args) {
        final Airplane biplane = new Airplane();
        biplane.setSpeed(TWOTWELVE);
        System.out.println(biplane.getSpeed());
        final Jet boeing = new Jet();
        boeing.setSpeed(FOURTWENTYTWO);
        System.out.println(boeing.getSpeed());
        int counter = 0;
        while (counter < FOUR) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > FIVETHOUSAND) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            }
            else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
    }
}
