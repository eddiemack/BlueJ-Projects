/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 */
import kareltherobot.*;
import java.awt.Color;

class FairyTaleMain implements Directions
{
    public static void main (String [] args)
    {
        Kid hansel = new Kid (1, 7, North, 0, Color.red);
        Kid gretel = new Kid (3, 5, South, 0, Color.blue);
        Kid jack = new Kid (4, 2, East, 0, Color.green);
        Kid jill = new Kid (7, 3, West, 0, Color.black);
        Kid pinnochio = new Kid (1, 2, North, 0, Color.cyan);
        pinnochio.riseAboveIfThereIsALeftWall();
        hansel.keepGoingUntilWall();
        gretel.keepGoingUntilWall();
        jack.keepGoingUntilWall();
        jill.keepGoingUntilWall();
        hansel.collectAllBeepers();
        gretel.collectAllBeepers();
        jack.collectAllBeepers();
        jill.collectAllBeepers();
        hansel.faceNorth();
        gretel.faceNorth();
        jack.faceNorth();
        jill.faceNorth();
        hansel.turnOff();
        gretel.turnOff();
        jack.turnOff();
        jill.turnOff();
    }
    
    static
    {
        World.setVisible (true);
        World.setTrace (false);
        World.readWorld ("FairyWorld.kwld");
        World.setDelay (10);
    }
}