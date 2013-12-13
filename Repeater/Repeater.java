import kareltherobot.*;
import java.awt.Color;

class Repeater extends UrRobot
{
    public Repeater (int s, int a, Direction d, int nOfB, Color c)
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
    public void spin360 (int number)
    {
        int counter;
        for (counter = 1; counter <= number; counter++)
        {
            turnLeft();
            turnLeft();
            turnLeft();
            turnLeft();
        }
    }
    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void pickBeeper (int number)
    {
        int counter;
        for (counter = 1; counter <= number; counter++)
        {
            pickBeeper();
        }
    }
}