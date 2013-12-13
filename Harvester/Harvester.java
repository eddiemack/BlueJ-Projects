import kareltherobot.*;
import java.awt.Color;

class Harvester extends UrRobot
{
    public Harvester (int s, int a, Direction d, int nOfB, Color c)
    {
        super (s, a, d, nOfB, c);
    }
    
    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveFirstRow ()
    {
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void moveRow ()
    {
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void nextRowRight ()
    {
        turnLeft();
        move();
        turnLeft();
    }
    public void nextRowLeft ()
    {
        turnRight();
        move();
        turnRight();
    }
}