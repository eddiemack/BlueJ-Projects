/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 */
import kareltherobot.*;
import java.awt.Color;

class HarveyMain implements Directions
{
    public static void main (String [] args)
    {
        Harvester harvey = new Harvester (2, 2, East, 0, Color.blue);
        harvey.moveFirstRow();
        harvey.nextRowRight();
        harvey.pickBeeper();
        harvey.moveRow();
        harvey.nextRowLeft();
        harvey.pickBeeper();
        harvey.moveRow();
        harvey.nextRowRight();
        harvey.pickBeeper();
        harvey.moveRow();
        harvey.nextRowLeft();
        harvey.pickBeeper();
        harvey.moveRow();
        harvey.nextRowRight();
        harvey.pickBeeper();
        harvey.moveRow();
        harvey.move();
    }
    
    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.readWorld ("field.kwld");
        World.setDelay (10);
    }
}