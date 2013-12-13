import kareltherobot.*;
import java.awt.Color;

class Kid extends Robot
{
    public Kid (int s, int a, Direction d, int n, Color c)
    {
        super (s, a, d, n, c);
    }
    public void keepGoingUntilWall()
    {
        while (frontIsClear ())
        {
            move();
        }
    }
    
    public void collectAllBeepers()
    {
        while (nextToABeeper ())
        {
            pickBeeper();
        }
    }
    
    public void faceNorth()
    {
        while (!facingNorth())
        {
            turnLeft();
        }
    }
    
    public void riseAboveIfThereIsALeftWall ()
    {
        while (hasALeftWall())
        {
            move();
        }
    }
    
    public boolean hasALeftWall()
    {
        turnLeft();
        if (!frontIsClear())
        {
            turnRight();
            return(true);
        }
        else
        {
            turnRight();
            return (false);
        }
    }
    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}