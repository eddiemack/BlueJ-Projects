/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 */
import kareltherobot.*;
import java.awt.Color;

class SteveMain implements Directions
{
    public static void main (String [] args)
    {
        StairSweeper steve = new StairSweeper (1, 1, East, 0, Color.black);
        steve.climbStair ();
        steve.pickBeeper ();
        steve.climbStair ();
        steve.pickBeeper ();
        steve.climbStair ();
        steve.pickBeeper ();
        steve.turnOff ();
    }
    
    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.setDelay (10);
        World.readWorld ("stairs.kwld");
    }
}