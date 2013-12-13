/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 */
import kareltherobot.*;
import java.awt.Color;

public class FredMain implements Directions
{
    public static void main (String [] args)
    {
        FenceBuilder fred = new FenceBuilder (1, 1, East, 0, Color.blue);
        fred.faceNorth();
        fred.findBeeperStack();
        fred.pickAllBeepers();
        fred.turnRight();
        fred.moveUnderHouse();
        fred.buildFence();
    }
    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.readWorld ("fence.kwld");
        World.setDelay (10);
    }
}