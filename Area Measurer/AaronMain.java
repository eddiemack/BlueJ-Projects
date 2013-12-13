/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 */

import kareltherobot.*;
import java.awt.Color;

public class AaronMain implements Directions
{
    public static void main (String [] args)
    {
        AreaMeasurer aaron = new AreaMeasurer (1, 1, East, infinity, Color.blue);
        aaron.measureArea();
    }
    
    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.readWorld ("AreaMeasurer.kwld");
        World.setDelay (10);
    }
}