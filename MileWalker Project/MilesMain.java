/**
 * I have neither given nor received unauthorized aid on this project.
 * Eddie Mack
*/
import kareltherobot.*;
import java.awt.Color;

class MilesMain implements Directions
{
    public static void main (String [] args)
    {
        UrRobot karel = new UrRobot (1, 1, East, 0, Color.green);
        MileWalker miles = new MileWalker (3, 2, East, 0, Color.blue);
        karel.move();
        //miles.moveMile();
        //miles.turnRight();
        //miles.turnAround();
        //miles.spin360();
        //miles.moveDiagonally();
        //miles.moveRandomly();
    }

    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.setDelay (10);
    }

}