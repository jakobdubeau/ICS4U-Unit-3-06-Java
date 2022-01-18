/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

/**
* Airplane.
*/
public class Airplane {
    /**
    * Speed variable.
    */
    private int speed;

    /**
    * Construct.
    */
    public Airplane() {
        speed = 0;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * Setter.
    *
    * @param newSpeed new speed
    */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }
}
