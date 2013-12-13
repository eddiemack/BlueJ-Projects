import kareltherobot.*;
import java.awt.Color;

class Racer extends Robot
{
    public Racer (int s, int a, Direction d, int n, Color c)
    {
        super (s, a, d, n, c);
    }
    
    public void riseIfRightWall ()
    {
        while (hasRightWall())
        {
            move();
        }
    }
    
    public boolean hasRightWall ()
    {
        turnRight();
        if (!frontIsClear())
        {
            turnLeft();
            return (true);
        }
        else
        {
            turnLeft();
            return (false);
        }
    }
    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move (int number)
    {
        int counter;
        for (counter = 1; counter <= number; counter++)
        {
            move();
        }
    }
}