/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 */
import kareltherobot.*;
import java.awt.Color;
class EddieMain implements Directions
{
    public static void main (String [] args)
    {
        UrRobot eddie = new UrRobot (1, 2, East, 0, Color.red);
        eddie.move();
        eddie.turnLeft();
        eddie.move();
        eddie.move();
        eddie.turnLeft();
        eddie.turnLeft();
        eddie.turnLeft();
        eddie.move();
        eddie.turnLeft();
        eddie.move();
        eddie.move();
        eddie.turnLeft();
        eddie.turnLeft();
        eddie.turnLeft();
        eddie.move();
        eddie.move();
        eddie.turnLeft();
        eddie.turnLeft();
        eddie.turnLeft();
        eddie.move();
        eddie.move();
        eddie.turnLeft();
        eddie.move();
        eddie.turnLeft();
        eddie.turnLeft();
        eddie.turnLeft();
        eddie.move();
        eddie.move();
        eddie.turnLeft();
        eddie.turnOff();
    }
    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.readWorld ("mountain.kwld");
        World.setDelay (10);
    }
}