/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 */
import kareltherobot.*;
import java.awt.Color;

class RobMain implements Directions
{
    public static void main (String [] args)
    {
        Repeater rob = new Repeater (1, 1, North, 0, Color.blue);
        rob.move(9);
        rob.spin360(3);
        rob.turnRight();
        rob.move(1);
        rob.pickBeeper(20);
        rob.turnLeft();
        rob.turnLeft();
        rob.move(1);
        rob.turnLeft();
        rob.move(9);
        rob.turnLeft();
        rob.turnLeft();
        rob.turnOff();
    }
    
    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.readWorld ("hallway.kwld");
        World.setDelay (9);
    }
}