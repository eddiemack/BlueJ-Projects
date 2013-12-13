import kareltherobot.*;
import java.awt.Color;

public class FenceBuilder extends Robot
{
    public FenceBuilder (int s, int a, Direction d, int n, Color c)
    {
        super (s, a, d, n, c);
    }
    public void faceNorth ()
    {
        while (!facingNorth ())
        {
            turnLeft();
        }
    }
    
    public void findBeeperStack ()
    {
        while (!nextToABeeper ())
        {
            move();
        }
    }
    
    public void pickAllBeepers ()
    {
        while (nextToABeeper ())
        {
            pickBeeper();
        }
    }
    
    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void moveUnderHouse ()
    {
        while (!leftHasWall ())
        {
            move();
        }
    }
    
    public boolean leftHasWall ()
    {
        turnLeft();
        if (!frontIsClear ())
        {
            turnRight();
            return (true);
        }
        else
        {
            turnRight();
            return (false);
        }
    }
    
    public void buildASide ()
    {
        while (leftHasWall ())
        {
            putBeeper();
            move();
        }
    }
    
    public void buildFence ()
    {
        buildASide();
        putBeeper();
        turnLeft();
        move();
        buildASide();
    }
}
