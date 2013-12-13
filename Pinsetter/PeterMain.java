/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 */
import kareltherobot.*;
import java.awt.Color;

class PeterMain implements Directions
{
    public static void main (String [] args)
    {
        Pinsetter peter = new Pinsetter (1, 5, North, 10, Color.blue);
        peter.move();
        peter.putBeeper();
        peter.move();
        peter.turnLeft();
        peter.move();
        peter.putBeeper();
        peter.turnAround();
        peter.move(2);
        peter.putBeeper();
        peter.turnLeft();
        peter.move(1);
        peter.turnRight();
        peter.move(1);
        peter.putBeeper();
        peter.turnAround();
        peter.move(2);
        peter.putBeeper();
        peter.move(2);
        peter.putBeeper();
        peter.turnRight();
        peter.move(1);
        peter.turnLeft();
        peter.move();
        peter.putBeeper();
        peter.turnAround();
        peter.move(2);
        peter.putBeeper();
        peter.move(2);
        peter.putBeeper();
        peter.move(2);
        peter.putBeeper();
        peter.turnRight();
        peter.move(4);
        peter.turnRight();
        peter.move(3);
        peter.turnRight();
        peter.turnOff();
    }
    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.setDelay (10);
    }
}