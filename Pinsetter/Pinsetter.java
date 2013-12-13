import kareltherobot.*;
import java.awt.Color;

class Pinsetter extends UrRobot
{
    public Pinsetter (int s, int a, Direction d, int nOfB, Color c)
    {
        super (s, a, d, nOfB, c);
    }
    public void move (int number)
    {
        int counter;
        for (counter = 1; counter <= number; counter++)
        {
            move();
        }
    }
    public void turnAround ()
    {
        turnLeft();
        turnLeft();
    }
    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}