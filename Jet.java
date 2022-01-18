/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

/**
* Jet class.
*/
public class Jet extends Airplane {
    /**
    * Multiply by 2.
    */
    private static final int MULTIPLIER = 2;

    /**
    * Constructor.
    */
    public Jet() {
    }

    /**
    * Setter for Jet speed.
    *
    * @param speed speed
    */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
    * Accelerates jet speed.
    */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }
}
