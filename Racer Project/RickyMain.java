/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 */
import kareltherobot.*;
import java.awt.Color;

public class RickyMain implements Directions
{
    public static void main (String [] args)
    {
        Racer ricky = new Racer (1, 1, North, 0, Color.blue);
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.move(1);
        ricky.turnRight();
        ricky.move(2);
        ricky.turnRight();
        ricky.turnRight();
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.move(1);
        ricky.turnRight();
        ricky.move(1);
        ricky.turnRight();
        ricky.turnRight();
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.move(1);
        ricky.turnRight();
        ricky.move(3);
        ricky.turnRight();
        ricky.turnRight();
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.move(1);
        ricky.turnRight();
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.turnRight();
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.turnRight();
        ricky.move(5);
        ricky.turnRight();
        ricky.turnRight();
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.move();
        ricky.turnRight();
        ricky.move(4);
        ricky.turnRight();
        ricky.turnRight();
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.move(1);
        ricky.turnRight();
        ricky.move(2);
        ricky.turnRight();
        ricky.turnRight();
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.move(1);
        ricky.turnRight();
        ricky.move(3);
        ricky.turnRight();
        ricky.turnRight();
        ricky.riseIfRightWall();
        ricky.turnRight();
        ricky.move(1);
        ricky.turnRight();
        ricky.move(5);
        ricky.pickBeeper();
        ricky.turnRight();
        ricky.turnRight();
        ricky.turnOff();
    }

    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.readWorld ("hurdles.kwld");
        World.setDelay (10);
    }
}